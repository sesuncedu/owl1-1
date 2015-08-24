# Rationale #

The mathematical nature of description logics has meant that domain experts find it hard to understand OWL-based ontologies. This forms a significant impediment to their creation and reuse. If domain experts' knowledge is to be represented and verified, an easily readable syntax for writing ontologies is needed.

# Features #

  * Reading (rendering) and writing

# Scoping Issues #

  * Language coverage alternatives
    * All of OWL 2, including extralogical features, annotations, datatypes, etc.
    * Concept expression language only (with axiomatic structure indicated otherwise, e.g., by indentation)
    * Some tractable fragment(s)
    * Core OWL 2 axioms only (i.e., logical content only)
  * Strict roundtrippability
    * Syntax-preserving round-tripping?
    * Semantics-preserving round-tripping?
  * Task - what's the language trying to do? Ontology specification, Querying and Reasoning may each be suited to different specifications.
  * Testing - how do we actually know people find it easy/easier than other syntaxes?

# Morphology issues #

OWL has (named) classes, object properties, data properties, individuals, numbers, datatype facets.
What are their CNL counterparts?

  * Class names
    * Nouns?
    * Countable nouns? Mass nouns?
    * Both singular and plural (e.g. man, men)?
    * Both lowercase and uppercase (e.g. man, Man)?
    * Multiword units (e.g. bus driver) are allowed?
    * Always preceded by a determiner (e.g. a, an, the, some, every, no)?
    * Attributive adjectives (rich man)?
    * Predicative adjectives (a man is rich)?
    * Intransitive verbs (a man waits)?
    * ing-forms (a man is smiling) are allowed?

  * Object property names
    * Transitive verbs (like)?
    * Both 3rd person forms (likes) and infinitives (does not like, do like)?
    * Transitive adjectives (fond of)?
    * Comparative adjectives (taller than)?
    * Multiword units (e.g. smiles at) are allowed?
    * Passives (is liked by) are allowed?
    * Non-contiguous forms (has ... as a father) are allowed?
    * of-construction + noun (the father of John) is allowed?
    * Saxon genitive + noun (John's father) is allowed?
    * "weird" verbs (John has-father Bill) are allowed?
    * Nouns (John father Bill) are allowed?

  * Data property names
    * Transitive verbs (E equals 2.718...)?
    * of-construction + noun (The age of John is 10) is allowed?
    * Saxon genitive + noun (John's age is 20) is allowed?

  * Individual names
    * Proper names?

  * Anonymous individuals
    * Common nouns (e.g. There is a man that owns a car.)?

  * Numbers
    * Numbers are 0, 1, 2, ...?
    * Numbers as words (one, two, ...) are allowed?
    * Should 0 be allowed? Forcing one to use negation instead would maybe result in more readable texts...

  * Datatype facets
    * Could we allow, e.g. John's age is >21.; John's age is 13-19.
    * ...


# Syntax Issues #

OWL descriptions and (possible) corresponding CNL function words.
(Note: data property restrictions are missing.)

| Description | CNL function words |
|:------------|:-------------------|
| owl:Thing   | something, somebody |
| ObjectUnionOf | or                 |
| ObjectIntersectionOf | and, that          |
| ObjectComplementOf | no, not, does/do not, is/are not |
| ObjectOneOf | or                 |
| ObjectAllValuesFrom | nothing but, only  |
| ObjectSomeValuesFrom | a, some            |
| ObjectExistsSelf | itself, himself, herself, himself/herself |
| ObjectHasValue |                    |
| ObjectMinCardinality | at least N, more than N-1 |
| ObjectMaxCardinality | at most N, less than N+1 |
| ObjectExactCardinality | exactly N          |

OWL axioms and (possible) corresponding CNL function words. (Note: data property axioms are missing.)

| Class Axiom | CNL keywords |
|:------------|:-------------|
| SubClassOf  | every, if ... then ..., is a kind of |
| EquivalentClasses | every, if ... then ..., classes ... are equivalent, every 

&lt;class&gt;

 is defined as, the class 

&lt;class&gt;

 is fully defined as ... |
| DisjointClasses | no, if ... then ..., classes ... are mutually exclusive |
| DisjointUnion |              |

| Object Property Axiom | CNL keywords |
|:----------------------|:-------------|
| SubObjectPropertyOf   | Everything that 

&lt;relationship1&gt;

 something that 

&lt;relationship2&gt;

 something will also 

&lt;relationship3&gt;

 that thing.; If something X 

&lt;relationship1&gt;

 something that 

&lt;relationship2&gt;

 something Y then X 

&lt;relationship3&gt;

 Y.; If X 

&lt;relationship1&gt;

 Y and Y 

&lt;relationship2&gt;

 Z then X 

&lt;relationship3&gt;

 Z. |
| DisjointObjectProperties | mutually exclusive; If something X 

&lt;relationship1&gt;

 something Y then it is false that X 

&lt;relationship2&gt;

 Y. |
| ...                   | ...          |



| Fact | CNL keywords |
|:-----|:-------------|
| SameIndividual | is, are the same thing, are the same individual |
| DifferentIndividuals | is not, are different things, are different individuals |
| ClassAssertion | 

&lt;individual&gt;

 is a 

&lt;class&gt;

, 

&lt;individual&gt;

 is not/does not/ ... |
| ObjectPropertyAssertion | 

&lt;individual1&gt;

 

&lt;relationship&gt;

 

&lt;individual2&gt;

 |
| NegativeObjectPropertyAssertion | 

&lt;individual1&gt;

 <relationship negation> 

&lt;individual2&gt;

 |



## Some notes ##

  * Data-properties can be hard to handle, see e.g. the definition of data ranges in the OWL 2 spec: http://www.w3.org/TR/owl2-syntax/#Data_Ranges
  * Some OWL 2 axioms (e.g. DisjointUnion) are a concise notation to express a large number of axioms. At least in some cases, graphical means seem better. e.g. the pie-chart visualization of DisjointUnion that Protege 4 offers seems better than any natural language representation.
  * Long syntactic patterns - useful to convey meaning the first time, but tiresome to type 100 times...

# Comparison of existing Controlled English syntaxes for OWL #

  * Comparison of Rabbit, SOS, and ACE
    * Paper: Rolf Schwitter, Kaarel Kaljurand, Anne Cregan, Catherine Dolbear and Glen Hart. [A Comparison of three Controlled Natural Languages for OWL 1.1](http://www.webont.org/owled/2008dc/papers/owled2008dc_paper_4.pdf)
    * Comparison table: http://owl1-1.googlecode.com/files/CNL_Comparisons_Table_v6.txt

# Implementations #

  * ACE and OWL
    * Translator ACE->OWL/SWRL is part of Attempto Parsing Engine
      * Web client: http://attempto.ifi.uzh.ch/ape/ (switch on "OWL FSS" or "OWL RDF" in the menu)
      * Source code: http://attempto.ifi.uzh.ch/site/downloads/
    * Translator OWL->ACE
      * Web client: http://attempto.ifi.uzh.ch/site/docs/owl_to_ace.html
      * Source code available on request
    * ACE View editor (plugin for Protege 4)
      * Uses ACE->OWL/SWRL and OWL->ACE
      * http://attempto.ifi.uzh.ch/aceview/
    * AceWiki
      * Uses ACE->OWL/SWRL
      * http://attempto.ifi.uzh.ch/acewiki/

# TODO #
  * Consideration of Empirical Studies - which approach has been found most effective?
  * Min Shi (Uli Sattler's student) conducting some empirical tests - Anne to chase  up current status / results
  * Start moving towards consensus on the best CNL translation for each OWL 2 construct


# Bibliography #

  * [Attempto group](http://attempto.ifi.uzh.ch/site/)'s work on CNL for OWL
    * [Kaarel Kaljurand. Attempto Controlled English as a Semantic Web Language. PhD thesis.](http://attempto.ifi.uzh.ch/site/pubs/papers/phd_kaljurand.pdf)
    * [Verbalizing OWL in Attempto Controlled English](http://webont.org/owled/2007/PapersPDF/submission_22.pdf) is an OWLED07 paper which discusses the mapping of OWL 2 axioms to ACE sentences
    * [OWL ACE Construction Rules](http://attempto.ifi.uzh.ch/site/docs/owlace_constructionrules.html) define sentence structures which are used when mapping OWL ontologies to ACE
    * [Writing OWL ontologies in ACE](http://attempto.ifi.uzh.ch/site/docs/writing_owl_in_ace.html) discusses the other direction, i.e. mapping ACE sentences to OWL axioms. Note that a much larger subset of ACE than used for OWL->ACE is considered.
  * Rabbit structured English
    * [Using Structured English to represent a Topographic Hydrology Ontology](http://webont.org/owled/2007/PapersPDF/submission_1.pdf)
    * Ontologies written in Rabbit - http://www.ordnancesurvey.co.uk/ontology
  * Sydney OWL Syntax
    * [Sydney OWL Syntax - towards a Controlled Natural Language Syntax for OWL 1.1](http://webont.org/owled/2007/PapersPDF/submission_24.pdf)
    * http://www.ics.mq.edu.au/~rolfs/sos/
    * http://www.ics.mq.edu.au/~rolfs/peng/
  * [Requirements for the treatment of multilinguality in ontologies at FAO](http://webont.org/owled/2007/PapersPDF/submission_45.pdf)
  * [Image Browsing and Natural Language Paraphrases of Semantic Web Annotations](http://image.ntua.gr/swamm2006/resources/paper11.pdf) -- Contains pilot user student measuring "understandability"
  * Avi Bernstein's group
    * [GINO - A Guided Input Natural Language Ontology Editor](http://www.ifi.uzh.ch/ddis/staff/goehring/btw/files/BernsteinEtAl_Gino_ISWC_2006.pdf)
    * [Querix: A Natural Language Interface to Query Ontologies Based on Clarification Dialogs](http://www.ifi.uzh.ch/ddis/staff/goehring/btw/files/Kaufmann_Querix_Demo_ISWC2006.pdf)
    * [NLP-Reduce: A "naïve" but Domain-independent Natural Language Interface for Querying Ontologies](http://www.ifi.uzh.ch/ddis/staff/goehring/btw/files/Kaufmann_NLP-Reduce_ESWC2007.pdf)
  * Rafaella Bernardi et al, University of Bozen-Bolzano, Italy, Controlled natural language for querying
  * Review papers
    * [Smart, P. R. (2008) Controlled Natural Languages and the Semantic Web](http://eprints.ecs.soton.ac.uk/15735/)

# People #

  * Catherine Dolbear (point person)
  * Bijan Parsia
  * Kaarel Kaljurand
  * Anne Cregan