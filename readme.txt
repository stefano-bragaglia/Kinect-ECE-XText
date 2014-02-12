Esempio di regole che l'editor consente di trattare

on Start set LeftArm to 999, set LeftArmStrConf to 999, set LeftArmLowConf to 999, set Score to 999;
on LeftArmStr(poseConf) set LeftArm to 1, set LeftArmStrConf to poseConf expect LeftArm==0 before 10 onFulf MyExpectationFulf;
on LeftArmLow(poseConf) set LeftArm to 0, set LeftArmLowConf to poseConf;
on MyExpectationFulf set Score to LeftArmStrConf * LeftArmLowConf;



Riscrittura per maggior comprensione:


on Start 
	set LeftArm to 999, 
	set LeftArmStrConf to 999, 
	set LeftArmLowConf to 999, 
	set Score to 999;
		

on LeftArmStr(poseConf) 
	set LeftArm to 1, 
	set LeftArmStrConf to poseConf 
	expect LeftArm==0 before 10 onFulf MyExpectationFulf;
		

on LeftArmLow(poseConf) 
	set LeftArm to 0, 
	set LeftArmLowConf to poseConf;
		

on MyExpectationFulf 
	set Score to LeftArmStrConf * LeftArmLowConf;