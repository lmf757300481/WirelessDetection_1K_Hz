package Test_1K_Hz;

import java.io.IOException;
import java.net.SocketException;
import java.util.Arrays;

import OMP_T1630.Demodulator;
import OMP_T1630.GSDataParser;
import OMP_T1630.UdpCommuncator;

public class Demo01 {

	public static void main(String[] args) throws SocketException, IOException {
		UdpCommuncator udp=new UdpCommuncator();
		OMP_T1630.Command_OPM_T1630 command=OMP_T1630.Command_OPM_T1630.Get_Scan_Frequency;
		udp.Initialize(command);
		/*»º³åÆ÷*/
		byte[] data=new byte[1024]; 
		for (int i = 0; i < 10; i++) {
			data=udp.recieve();
			System.out.println(Arrays.toString(data));
			short scanFrequency=GSDataParser.getInterval(data[2],data[3]); //·µ»ØµÄÊÇ1000
			System.out.println(scanFrequency);
			System.out.println();
		}
	}

}
