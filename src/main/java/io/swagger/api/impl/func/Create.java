package io.swagger.api.impl.func;


import org.libvirt.Connect;
import org.libvirt.Domain;

import java.util.UUID;
import java.io.RandomAccessFile;

/**
 * Created by jurjen on 10/22/16.
 */
public class Create {
    private String TEMPLATE = "<domain type='kvm'>" + "<name>$vmName</name>" + "<uuid>$vmUuid</uuid>"
            + "<memory>$vmMemory</memory>" + "<vcpu>1</vcpu>" + "<os>"
            + "<type arch='x86_64' machine='pc-1.0'>hvm</type>" + "<boot dev='cdrom'/>" + "<boot dev='hd'/>" + "</os>" + "<clock offset='utc'/>"
            + "<on_poweroff>destroy</on_poweroff>" + "<on_reboot>restart</on_reboot>" + "<on_crash>destroy</on_crash>"
            + "<devices>" + "<emulator>/usr/bin/kvm</emulator>" + "<disk type='file' device='disk'>"
            + "<source file='$vmImage'/>" + "<driver name='qemu' type='raw'/>" + "<target dev='hda' bus='ide'/>"
            + "<alias name='ide0-0-0'/>" + "<address type='drive' controller='0' bus='0' unit='0'/>" + "</disk>" + "<disk type='file' device='disk'>"
            + "<source file='$vmStorage'/>" + "<driver name='qemu' type='raw'/>" + "<target dev='hda' bus='ide'/>"
            + "<alias name='ide0-0-0'/>" + "<address type='drive' controller='0' bus='1' unit='0'/>" + "</disk>"
            + "<controller type='ide' index='0'>" + "<alias name='ide0'/>"
            + "<address type='pci' domain='0x0000' bus='0x00' slot='0x01' function='0x1'/>" + "</controller>"
            + "<interface type='network'>" + "<mac address='52:54:00:6a:84:e9'/>" + "<source network='network'/>"
            + "<target dev='vnet0'/>" + "<alias name='net0'/>"
            + "<address type='pci' domain='0x0000' bus='0x00' slot='0x03' function='0x0'/>" + "</interface>"
            + "<input type='mouse' bus='ps2'/>" + "<graphics type='vnc' port='5900' autoport='yes'/>" + "<video>"
            + "<model type='cirrus' vram='9216' heads='1'/>" + "<alias name='video0'/>"
            + "<address type='pci' domain='0x0000' bus='0x00' slot='0x02' function='0x0'/>" + "</video>" + "</devices>"
            + "</domain>";

    public boolean createDomain(String vmName,
                                UUID vmUuid,
                                int vmMemory,
                                String vmImage,
                                UUID storageUuid
    ) {
        String template;
        Connect conn;
        String memory = String.valueOf(vmMemory);
        try {

            conn = new Connect("qemu:///system");

            template = TEMPLATE;
            template = template.replace("$vmName", vmName);
            template = template.replace("$vmMemory", memory);
            template = template.replace("$vmImage", vmImage);
            template = template.replace("$vmUuid", vmUuid.toString());
            createStorageFile(storageUuid.toString(), 100);
            Domain domain = conn.domainDefineXML(template);
            domain.create();


            conn.close();
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean createStorageFile(String sfUUID, int size) {
        try {
            String defaultStorageLocation = "/var/lib/libvirt/images" + sfUUID + ".img";
            RandomAccessFile randomFile = new RandomAccessFile(defaultStorageLocation, "rw");
            randomFile.setLength(1024 * 1024 * size);
        } catch (Exception e) {
            System.out.print(e);
            return false;
        }
        return true;
    }

}

