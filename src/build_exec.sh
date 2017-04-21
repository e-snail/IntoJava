#!/bin/sh

#jar cvfm memory.jar MANIFEST.MF -C memory/ .
jar cvfm memory.jar memory_MANIFEST.MF memory/MemorySizeOf.class 

javac -cp ./memory.jar intojava/MainEntry.java intojava/EmptyClass.java

java -javaagent:./memory.jar intojava/MainEntry
