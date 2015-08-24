# Rationale #

Given that the [SPARQL query language](http://www.w3.org/TR/rdf-sparql-query/) will be a W3C recommendation in 2007, that several OWL implementations use SPARQL syntax as a query langauge, that many users want a (standard) query language for OWL and expect to be able to use SPARQL to query OWL, and that, nominally, SPARQL is designed to be extensible to OWL, there should be an extension of SPARQL to query OWL.

Three goals:
  1. to cover what we "know" how to do
  1. to describe existing implementations
  1. to meet user desires with minimal "surprise" when transitioning from RDF(S)

# Features #

  * Arbitrary conjunctive queries
  * Syntactic higher orderness:
    * Property variables
    * TBox queries and mixed ABox/TBox queries
  * Sensible profiles
    * ABox query only
    * All distinguished variables
  * Specification using OWL1.1 functional syntax

# Big Issues #

  * Alternative syntaxes (e.g., for the XML and functional syntaxes?)
  * Syntax for non-distinguished vars

> Currently, in Pellet, BNodes in BGPs are non-distinguished variables; all query variables are distinguished, though they may be projected away. I.e.,
> > `SELECT ?x WHERE {?x loves _:x. _:x loves ?y`}
has three variables (`?x`, `_:x`, and `?y`), `?x` and `?y` are distinguished (though `?y` is projected away) and `_:x` is non-distinguished.

This query is equivalent to retrieving the instances of the following concept (assuming that in your ABox that for every distinct name of an individual you add the type assertion that they are an instance of the dummy class :O):


> `ObjectSomeValuesFrom(ObjectProperty(loves)  ObjectSomeValuesFrom(ObjectProperty(loves) OWLClass(O)))`
  * BNodes (in data and in results)

# Bibliography #

  * [SPARQL/DL: SPARQL Query for OWL-DL](http://webont.org/owled/2007/PapersPDF/submission_23.pdf)
  * S3NotesOwled2007 -- Query paper session at OWLED 2007
  * P1NotesOwled2007 -- Query and rules panel at OWLE 2007
  * ...


# Implementations #

For brevity and clarity we only list implementations that cover a significant fraction of OWL, e.g., one of the named fragments (more than RDFS).

## Query Engines ##

| Name | Sparql Syntax |DL | TBox | Non-dist vars | Property vars | Algebra | Comments |
|:-----|:--------------|:--|:-----|:--------------|:--------------|:--------|:---------|
| [Pellet](http://pellet.owldl.com/) | Yes           | OWL 1.1/SROIQ | No   | Yes           | No            | Yes (via ARQ) |          |
| [KAON2](http://kaon2.semanticweb.org/)| Yes           | SHIQ | No   | No            | No            | ?       | DL safe rules might encode algebra |
| [Racer](http://www.racer-systems.com/) | No (nRQL, OWL-QL) | SHIQ | With special constructs | No            | ?             | UNION   | nRQL is rather expressive |
| [QuOnto](http://www.dis.uniroma1.it/~quonto/) | No (SQL, Datalog) | DL-Lite | No   | ?             | ?             | ?       |          |

## Clients ##

| Name | Type | Notes |
|:-----|:-----|:------|
| [Protege 4 alpha](http://protege.stanford.edu/download/prerelease-alpha/) | Editor | Oops, only DIG like queries|
| [Protege/OWL 3.2](http://protege.stanford.edu/doc/sparql/) | Editor | May be tricky to get OWL semantics|
| [Swoop](http://code.google.com/p/swoop/) | Editor |       |
| [TopBraid Composer](http://www.topbraidcomposer.com/) | Editor |       |
| [Pellet demo](http://www.mindswap.org/2003/pellet/demo.shtml) | Web demo | Examples of non-dist vars|
| [QuOnto demo](http://www.dis.uniroma1.it/quonto-demo/) | Web demo | Limited ontologies |

# People #

  * [Bijan Parsia](http://www.cs.man.ac.uk/~bparsia/) (point person)
  * [Dmitry Tsarkov](http://intranet.cs.man.ac.uk/img/people/#dts)