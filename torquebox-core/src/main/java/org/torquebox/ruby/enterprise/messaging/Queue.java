package org.torquebox.ruby.enterprise.messaging;


public class Queue extends Destination {
	
	public Queue() {
		
	}
	
	public void start() throws Exception {
		log.info( "start queue " + getName() );
		
		getServer().createQueue(getName(), "topics/" + getName(), null, true);
	}
	
	public void stop() throws Exception {
		log.info( "stop queue " + getName() );
		
		getServer().destroyQueue( getName() );
	}

}
