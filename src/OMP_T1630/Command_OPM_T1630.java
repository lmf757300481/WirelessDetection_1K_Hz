package OMP_T1630;

public enum Command_OPM_T1630 {
	 Get_Peak_WaveLength("��ȡ��������", new byte[] {0x01,0x0c}),
	 Get_Peak_Power("��ȡ����ǿ��", new byte[] {0x01,0x10}),
	 
	 Get_Single_Channel_Spectrum("��ȡ��ͨ������", new byte[] {0x01,0x17}),
	Get_WaveLength_Start_And_Interval_And_Count_And_ChannelNo("��ȡ������㡢�������������������ͨ����", new byte[] {0x01,0x20}),
	 
	 Start_Control_Get_Peak_WaveLength_And_Power("��ͣ����-��ȡ������ǿ��",new byte[] {0x01,0x0a,0x55,0x55}),
	 
	 Start_Control_Get_Peak_WaveLength("��ͣ����-������ȡ����-����ȡǿ��",new byte[] {0x01,0x0a,0x55}),
	 Start_Control_Stop_Peak_WaveLength("��ͣ����-ֹͣ���Ͳ���-����ȡǿ��",new byte[] {0x01,0x0a,0x00}),
	 
	 Get_Optic_Spectrum("��ȡ0ͨ������", new byte[] {0x01,0x16,0x00}),
	 Get_WaveLength_Start_And_Interval_And_Count_And_ChannelNo_And_Data_Frames("��ȡ������㡢�������������������ͨ����������֡��", new byte[] {0x01,0x17}),
	 
	 Get_WaveLength_Shift("��ȡ����ƫ����", new byte[] {0x01,0x26}),
	 Set_WaveLength_Shift_1_pm("���ò���1pmƫ����", new byte[] {0x01,0x24,0x01,0x00}),
	 
	 Get_Scan_Frequency("��ȡɨ��Ƶ��", new byte[] {0x01,0x30}),
	 Set_Scan_Frequency("����ɨ��Ƶ��", new byte[] {0x01,0x30}),//�ƻ�����Ϊ1000
	 
	 
	 ;
	
	
	
	// Start_GetW("��ɫ", 4);
    
    
    private String name ;
    private byte[] command ;
     
    private Command_OPM_T1630( String name , byte[] command ){
        this.name = name ;
        this.command = command ;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public byte[] getIndex() {
        return command;
    }
    public void setIndex(byte[] command) {
        this.command = command;
    }

}
