package com.swabhav.structural.proxy.test;

import com.swabhav.structural.proxy.model.Image;
import com.swabhav.structural.proxy.model.ProxyImage;

public class ProxyTest {
	public static void main(String[] args) {
        Image image = new ProxyImage("animal.jpg");
 
        // Image will be loaded from disk only when display() is called
        image.display();
 
        // Image will not be loaded again, as it has been cached in the Proxy
        image.display();
    }
}
