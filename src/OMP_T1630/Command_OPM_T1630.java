package OMP_T1630;

public enum Command_OPM_T1630 {
	 Get_Peak_WaveLength("获取波长数据", new byte[] {0x01,0x0c}),
	 Get_Peak_Power("获取波长强度", new byte[] {0x01,0x10}),
	 
	 Get_Single_Channel_Spectrum("获取单通道光谱", new byte[] {0x01,0x17}),
	Get_WaveLength_Start_And_Interval_And_Count_And_ChannelNo("获取波长起点、波长间隔、波长点数、通道数", new byte[] {0x01,0x20}),
	 
	 Start_Control_Get_Peak_WaveLength_And_Power("启停控制-获取波长和强度",new byte[] {0x01,0x0a,0x55,0x55}),
	 
	 Start_Control_Get_Peak_WaveLength("启停控制-启动获取波长-不获取强度",new byte[] {0x01,0x0a,0x55}),
	 Start_Control_Stop_Peak_WaveLength("启停控制-停止发送波长-不获取强度",new byte[] {0x01,0x0a,0x00}),
	 
	 Get_Optic_Spectrum("获取0通道光谱", new byte[] {0x01,0x16,0x00}),
	 Get_WaveLength_Start_And_Interval_And_Count_And_ChannelNo_And_Data_Frames("获取波长起点、波长间隔、波长点数、通道数、数据帧数", new byte[] {0x01,0x17}),
	 
	 Get_WaveLength_Shift("获取波长偏移量", new byte[] {0x01,0x26}),
	 Set_WaveLength_Shift_1_pm("设置波长1pm偏移量", new byte[] {0x01,0x24,0x01,0x00}),
	 
	 Get_Scan_Frequency("读取扫描频率", new byte[] {0x01,0x30}),
	 Set_Scan_Frequency("设置扫描频率", new byte[] {0x01,0x30}),//计划设置为1000
	 
	 
	 ;
	
	
	
	// Start_GetW("黄色", 4);
    
    
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
