package com.jamesward;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Main
{
    
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception
    {
        String webappDirLocation = "src/main/webapp/";
        
        Server server = new Server(8080);
        WebAppContext root = new WebAppContext();

        root.setContextPath("/");
        root.setDescriptor(webappDirLocation + "/WEB-INF/web.xml");
        root.setResourceBase(webappDirLocation);
        
        root.setParentLoaderPriority(true);
        
        server.setHandler(root);
        
        server.start();
        server.join();   
    }

}
