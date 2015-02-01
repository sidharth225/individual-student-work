{\rtf1\ansi\ansicpg1252\cocoartf1344\cocoasubrtf720
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww28600\viewh16500\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural

\f0\fs24 \cf0 class PublicPerson \{\
	public String name;\
	public int age;\
\}\
\
class PrivatePerson \{\
	public PrivatePerson(String first, String last, int year)\{\
		this.name = first + \'93 \'93 + last\
		this.age = (2015-year);\
	\}\
\
	private String name;\
	private int age;\
\
	public int getAge()\{\
		return this.age;\
	\}\
\
	public String getName()\{\
		return this.name;\
	\}\
\}\
\
public class Visibility \{	\
	public static void main(String[] args) \{\
 		PrivatePerson personOne = new PrivatePerson("James", "Smith", 2005);\
		System.out.println("Created a new person " + personOne.getName()\
		+ " who is " + personOne.getAge() + " years old");\
\
		PublicPerson personTwo = new PublicPerson("Dave", "Jones", 1989);\
\
		System.out.println("Created a new person " + personTwo.name\
		+ " who is " + personTwo.age + " years old");\
\
		String oldestName = whoIsOlder(personOne, personTwo);\
\
		System.out.println("The oldest person is " + oldestName);\
	\}\
	public whoIsOlder(PrivatePerson, Public person)\{\
		if (PrivatePerson.getAge() > PublicPerson.age)\{\
			return PrivatePerson.getName();\
		\}\
		else\{\
			return PublicPerson.name;\
		\}\
	\}\
	\
\}\
\
}