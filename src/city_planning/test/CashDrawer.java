/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.test;

import java.util.Enumeration;
import javax.comm.CommPort;
import javax.comm.CommPortIdentifier;
import javax.comm.PortInUseException;

/**
 *
 * @author Cordura
 */
public class CashDrawer {

    public static void main(String[] args) {
        Enumeration ports = CommPortIdentifier.getPortIdentifiers();
        while (ports.hasMoreElements()) {
            CommPortIdentifier port = (CommPortIdentifier) ports.nextElement();
            String type;
            switch (port.getPortType()) {
                case CommPortIdentifier.PORT_PARALLEL:
                    type = "Parallel";
                    break;
                case CommPortIdentifier.PORT_SERIAL:
                    type = "Serial";
                    break;
                default: /// Shouldn't happen
                    type = "Unknown";
                    break;
            }
            System.out.println(port.getName() + ": " + type);
        }
    }

    public static void main2(String[] args) {
        Enumeration port_list = CommPortIdentifier.getPortIdentifiers();

        while (port_list.hasMoreElements()) { //This part in the diving, why not you?
// Get the list of ports
            CommPortIdentifier port_id = (CommPortIdentifier) port_list.nextElement();

// Find each ports type and name
            if (port_id.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                System.out.println("Serial port: " + port_id.getName());
            } else if (port_id.getPortType() == CommPortIdentifier.PORT_PARALLEL) {
                System.out.println("Parallel port: " + port_id.getName());
            } else {
                System.out.println("Other port: " + port_id.getName());
            }

// Attempt to open it
            try {
                CommPort port = port_id.open("PortListOpen", 20);
                System.out.println(" Opened successfully");
                port.close();
            } catch (PortInUseException pe) {
                System.out.println(" Open failed");
                String owner_name = port_id.getCurrentOwner();
                if (owner_name == null) {
                    System.out.println(" Port Owned by unidentified app");
                } else // The owner name not returned correctly unless it is
                // a Java program.
                {
                    System.out.println(" " + owner_name);
                }
            }
        }
    }
}
