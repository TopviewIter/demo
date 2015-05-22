package com.zluo.quartz.job;

import javax.annotation.Resource;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.zluo.quartz.service.JobService;

/**
 * 
 * 项目名称：quartz_demo <br> 
 * 类名称：ScheduleJob  <br>
 * 类描述：  <br>
 * 创建人：louzhangjie  <br>
 * 创建时间：2015年5月22日 下午10:01:04  <br>
 * 修改人：louzhangjie <br>
 * 修改时间：2015年5月22日 下午10:01:04  <br>
 * 修改备注：  <br>
 * @version 1.0  <br>
 *
 */
public class ScheduleJob implements Job{

	@Resource
	private JobService jobService;
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		jobService.work();
	}

}
