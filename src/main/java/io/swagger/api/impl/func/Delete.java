package io.swagger.api.impl.func;

import org.libvirt.Connect;
import org.libvirt.Domain;
import org.libvirt.LibvirtException;

import java.util.UUID;

/**
 * Created by jurjen on 10/22/16.
 */
public class Delete {
    public boolean deleteDomain(UUID vmUuid){
        Connect conn;
        Domain domain;
        try {

            conn = new Connect("qemu:///system");
            domain = conn.domainLookupByUUID(vmUuid);


            domain.destroy();
            domain.undefine();
        }catch (LibvirtException e){
            System.out.print(e);
            return false;
        }



        return true;
    }
}