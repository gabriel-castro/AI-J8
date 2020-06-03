# this makefile sucks but it does the job

all: clean main

main:
	javac *.java

clean:
	touch crap.class
	rm *.class
