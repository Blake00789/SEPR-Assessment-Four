package com.dicycat.kroy;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({ 
	AlienTest.class,
	BulletDispenserTest.class,
	BulletTest.class,
	EntityTest.class,
	FireStationTest.class,
	FireTruckTest.class,
	FortressTest.class,
	GameObjectTest.class,
	StatBarTest.class,
	WaterStreamTest.class,
	})

public class AllTests {
}