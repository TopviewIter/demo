package com.zluo.quartz.factory;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;

/**
 * 
 * 项目名称：quartz-demo <br> 
 * 类名称：MJobFactory  <br>
 * 类描述：  用于让spring可以在Job的实现类中进行注入<br>
 * 创建人：louzhangjie  <br>
 * 创建时间：2015年5月22日 下午10:18:12  <br>
 * 修改人：louzhangjie <br>
 * 修改时间：2015年5月22日 下午10:18:12  <br>
 * 修改备注：  <br>
 * @version 1.0  <br>
 *
 */
public class MJobFactory extends AdaptableJobFactory {

	//这个对象Spring会帮我们自动注入进来,也属于Spring技术范畴.
	  @Autowired
	  private AutowireCapableBeanFactory capableBeanFactory;
	  
	  protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
	    //调用父类的方法
	    Object jobInstance = super.createJobInstance(bundle);
	    //进行注入,这属于Spring的技术,不清楚的可以查看Spring的API.
	    capableBeanFactory.autowireBean(jobInstance);
	    return jobInstance;
	  }

}
