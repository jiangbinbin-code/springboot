package com.ghac.myspilder.myspilder3.util;

import java.io.File;

/**
 * 获取安装路径
 */
public class AppPathUtil
{
	private final static String WIN = "windows";
//	private final static String LINUX = "Linux";
	private final static String OS = System.getProperty("os.name");
	private static AppPathUtil instance = new AppPathUtil();
	private AppPathUtil()
	{}
	public static AppPathUtil getInstance()
	{
		return instance;
	}
	/**
	 * 获取安装路径
	 * @return
	 */
	public String getInstallPath()
	{
//		return instance.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		String installPath = System.getProperty("user.dir")+File.separator;
		if(OS != null && OS.toLowerCase().contains(WIN))
			installPath = installPath.replaceAll("\\\\","\\\\\\\\");
		return installPath;
	}
	/**
	 * 获取配置文件路径
	 * @return
	 */
	public String getConfigPath()
	{
		String configPath = System.getProperty("user.dir")+File.separator+"configs"+File.separator;
		if(OS != null && OS.toLowerCase().contains(WIN)) {
			configPath = configPath.replaceAll("\\\\", "\\\\\\\\");
		}
		return configPath;
	}

	/**
	 * 获取图片路径
	 * @return
	 */
	public String getImagePath()
	{
		String configPath = System.getProperty("user.dir")+File.separator+"image"+File.separator;
		if(OS != null && OS.toLowerCase().contains(WIN)) {
			configPath = configPath.replaceAll("\\\\", "\\\\\\\\");
		}
		return configPath;
	}


	/**
	 * 获取日志文件路径
	 * @return
	 */
	public String getLogPath()
	{
		String logPath = System.getProperty("user.dir")+File.separator+"logs"+File.separator;
		if(OS != null && OS.toLowerCase().contains(WIN))
			logPath = logPath.replaceAll("\\\\","\\\\\\\\");
		return logPath;
	}
	
	/**
	 * 获取历史文件保存路径
	 * @return
	 */
	public String getHisPath()
	{
		String hisPath = System.getProperty("user.dir")+File.separator+"his"+File.separator;
		if(OS != null && OS.toLowerCase().contains(WIN))
			hisPath = hisPath.replaceAll("\\\\","\\\\\\\\");
		return hisPath;
	}
}
