package com.swabhav.behavioural.state.test;

import com.swabhav.behavioural.state.model.Ordered;
import com.swabhav.behavioural.state.model.Packet;

public class PacketTest {
	public static void main(String[] args) {
		Packet packet = new Packet(new Ordered());
		
		System.out.println("Next ---->");
		System.out.println(packet.getPacketState());
		packet.next();
		System.out.println(packet.getPacketState());
		packet.next();
		System.out.println(packet.getPacketState());
		packet.next();
		System.out.println(packet.getPacketState());
		System.out.println("\nPrevious ---->");
		System.out.println(packet.getPacketState());
		packet.previous();
		System.out.println(packet.getPacketState());
		packet.previous();
		System.out.println(packet.getPacketState());
		packet.previous();
		System.out.println(packet.getPacketState());

		
	}
}
