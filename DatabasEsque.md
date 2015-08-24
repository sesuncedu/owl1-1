# Rationale #

There are a number of features familiar to people working with databases that either work differently in OWL (inheritence), are currently restricted (keys) or missing (integrity constraints). There is a great deal of work e.g., from the description logic community for adding variants of these features. There is also quite a bit of folk knowledge of how to work around the lack (either at the ontology level or the system level).

# Current Topics #

The TF is working on three topics at the moment:

  1. Keys (EasyKeyProposal)
  1. Constraints (aka, TBox closure)
  1. Closing some part of your knowledge base. We distinguish between
    * formalisms that allow to make general statements in your ontology and
    * query languages that allow you to query with "closing" constructs such as epistemic operators

# References #
  * Keys
    * [On the effects of using keys on datatype properties](http://www.cs.man.ac.uk/~horrocks/Publications/download/2004/LAHS04a.pdf)
    * [Keys For Ontologies – You Choose](http://webont.org/owled/taskforces/dbe/keys_poster.pdf)
    * [Can OWL model football leagues?](http://webont.org/owled/2007/PapersPDF/paper_19.pdf)
  * Constraints
    * [Adding Integrity Constraints to OWL](http://webont.org/owled/2007/PapersPDF/submission_9.pdf)
    * [Bridging the Gap Between OWL and Relational Databases](http://www.cs.man.ac.uk/~bmotik/publications/papers/mhs07bridging.pdf)
  * Closing some aspect of your knowledge
    * [Closing Semantic Web Ontologies](http://www.cs.man.ac.uk/~bmotik/publications/papers/mr06closing-report.pdf)
    * [Implementing OWL defaults](http://www.webont.org/owled/2006/acceptedLong/submission_22.pdf)
    * [Embedding Defaults into Terminological Representation Systems](http://lat.inf.tu-dresden.de/research/papers.html)
    * [Careful closure of inheritance networks](http://www.dis.uniroma1.it/~ai/citations/Len-91b.html)
    * [An epistemic operator for description logics](http://dx.doi.org/10.1016/S0004-3702(98)00009-5)
  * Query languages with epistemic operators for "closing" your assumptions
    * [Using epistemic operators in query languages](http://www.tonesproject.org/index.php?option=com_docman&Itemid=45&task=docclick&bid=87&limitstart=0&limit=20)
    * [EQL-Lite: Effective First-Order Query Processing in Description Logics](http://www.ijcai.org/papers07/Papers/IJCAI07-042.pdf)


# Dependencies #

Sometimes these features are realized in or in conjunction with rules or query languages, so SafeRules and SparqlOwl are relevant.

# People #

  * [Uli Sattler](http://www.cs.man.ac.uk/~sattler/) (point person)
  * [Ian Horrocks](http://www.cs.man.ac.uk/~horrocks/)
  * [Bijan Parsia](http://www.cs.man.ac.uk/~bparsia/)
  * Evan Wallace
  * [Michel Dumontier](http://dumontierlab.com/)
  * [Thomas Schneider](http://www.cs.man.ac.uk/~schneidt/)










