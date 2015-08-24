# Macros and Syntax Task Force #

Point person: [Alan Ruttenberg](mailto:alanruttenberg@gmail.com)

Idea is to allow for programmable extensions to syntax to enable easy construction of [domain specific languages](http://en.wikipedia.org/wiki/Domain-specific_programming_language)(DSLs) based on OWL. Inspired by the [Common Lisp macro facility](http://www.cs.cmu.edu/Groups/AI/html/cltl/clm/node97.html)

# Details #

Starting point is the abstract (sans followup paper, unfortunately) submitted to OWLED 2007:

[Hey! You Got Imperative in My Declarative! or  A Mashup Made in Heaven: Making OWL friendlier with Javascript. ](http://ftp.informatik.rwth-aachen.de/Publications/CEUR-WS/Vol-258/paper44.pdf)

See also, an example of macros prototyped in [LSW](http://esw.w3.org/topic/LSW), in [reactions.lisp](http://svn.mumble.net:8080/svn/lsw/trunk/owl/reactions.lisp) that allows one to write: `(reaction !reaction1 ((2 !h) !o) <=> !h2o)`

Another example developed to illustrate how to write a certain class of
[rules useful for medical diagnosis](http://lists.w3.org/Archives/Public/public-semweb-lifesci/2007Feb/0076.html). This one lets you write things like: `(patient-with-symptoms !patient3 !coughs !sneezes !turnsBlue)`

My initial thoughts are to have macros expand into the functional syntax, represented as some data structure in the language in which the macros are implemented.  An open question is whether that structure should be modified from the "outside", as with a DOM, or from the "inside", by implementing a lisp-like interpreter to do the macro-expansion.

Another approach would be to operate at the RDF level, defining a translation from a simpler RDF document to a more complicated one via the use of SPARQL construct statements. You can prototype such a thing now with the [DERI pipes](http://pipes.deri.org:8080/pipes/) transform pipe.

Noteworthy:
  * [The Rabbit Language](http://www.ordnancesurvey.co.uk/oswebsite/partnerships/research/publications/docs/2007/Rabbit_Language_v1.pdf)

This page maintained by [Alan Ruttenberg](mailto:alanruttenberg@gmail.com). Feel free to edit.