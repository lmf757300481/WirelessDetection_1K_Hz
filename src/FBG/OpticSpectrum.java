package FBG;

import java.sql.Date;
import java.util.ArrayList;

import OMP_T1630.UdpCommuncator;

public class OpticSpectrum {
	
	//Tue Mar 06 16:00:25 CST 2018  [1529.3, 20.0, 1800.0, 8.0, 5.0]
			Date  OpticSpectrumTime;  //���ײ�����ʱ��
			double waveLengthStart;   //������ʼֵ ��λnm  Ĭ��1529.3
			double waveLengthInterval;   //�������ֵ ��λpm  Ĭ��20.0
			int count=1800;        //��������  Ĭ��1800��
			int channelNo;    //ͨ����  Ĭ��0
			int dataFramesCount;   //����֡��  Ĭ��5
			
			double centralWavelength;  //���Ĳ����� �����һ֡������
			double centralPower;  //���Ĳ�����ǿ�ȣ� �����һ֡������
			
			byte[] dataFramesSplice=new byte[4*1024];  //��һ��Ĭ��Ϊ5�ĳ���
			
			ArrayList<Double> listWavelengths=new ArrayList<Double>();
			ArrayList<Double> listPowers=new ArrayList<Double>();
			

	public OpticSpectrum() {
		// TODO Auto-generated constructor stub		
	}
	
	public static double parsePwer(byte dataL,byte dataH) //���ֽ���ǰ
	{
		byte[] dataRec= new byte[2];		
		dataRec[0]=dataL;
		dataRec[1]=dataH;
		short Df=(short) (OMP_T1630.UdpCommuncator.byteToInt(dataL)+OMP_T1630.UdpCommuncator.byteToInt(dataH)*256);//TypeConvert.getShort(dataRec,true,2);
		return Df/10.0;
//		short dus=(short) (dataL+dataH*256);		
//		return  dus*1.0/10.0;
	}
	

}
