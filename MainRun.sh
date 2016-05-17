#!/bin/bash

javac FirstCleanStage.java
java FirstCleanStage $1 $3 > "FirstCleaned.txt"

javac CreateSecondaryStageScript.java
java CreateSecondaryStageScript $2 > "SecondaryStage.sh"

javac Converter.java
sh SecondaryStage.sh
