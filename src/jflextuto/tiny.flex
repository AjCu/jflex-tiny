package jflextuto;
import java_cup.runtime.Symbol;
%%
%class Tiny
%char
%line
%type java_cup.runtime.Symbol
%%
[if]+         { return new Symbol(2,yytext());}
[else]+       { return new Symbol(2,yytext());}
[then]+       { return new Symbol(2,yytext());}
[repeat]+     { return new Symbol(2,yytext());}
[until]+      { return new Symbol(2,yytext());}
[read]+       { return new Symbol(2,yytext());}
[(]        { return new Symbol(3,yytext());}
[)]        { return new Symbol(4,yytext());}
[{]        { return new Symbol(5,yytext());}
[}]        { return new Symbol(6,yytext());}
[0-9]+     { return new Symbol(7,yytext());}
[+]        { return new Symbol(8,yytext());}
[-]        { return new Symbol(9,yytext());}
[norte]+      { return new Symbol(10,yytext());}
[sur]+        { return new Symbol(11,yytext());}
,          { return new Symbol(12,yytext());}
[/n/r\n\r ]+ { System.out.println("ignorando caracter");}



