# Panel Session 2: Industry #


### Henson Graves - Lockheed Martin ###
  * Aerospace is a large industry, long development span, long lifecycle
  * Massive amounts of data

  * Where does OWL fit in?
    * Use OWL to manage the data, interrelate enterprise data
    * Semantic interoperability needed for assessment, requirements and integration

  * OWL can scale

  * Class definitions
    * There are lots of safe clases that I can define with a "class abstraction" construction that I cannot define in DL
  * Data Types
    * Need to describe functions/proceses used in product development
    * Add function abstraction type as a complex type
  * Rules and Proof Theory
    * Need rules to pattern match function expressions to evidence
    * Not doing automated reasoning, but try to assemble all of the stuff that leads to the underpinnign of the assertion

### Ralf Moeller - Racer ###
  * Persistency / Distributed Systems
    * Reasoning on persistent Aboxes (now already possible for simple ontologies, DL-Lite)
  * Data integration from heterogeneous databases using ontologies
  * Stream-based processing
    * Event recognition: it becomes more important that instances are asserted to the a-box.

  * Module extraction for reuse
  * Model finding (e.g. for solving construction problems). Use the ontology to use to come up with a solution for an important indusctrial problem
  * Abduction
    * For abstraction from texts

  * OWL DL is not enough
    * constraints between attributes of differnt individuals
    * Can be done using e.g. SWRL but does not scale
    * Important in e.g. the Geospatial domain

  * Query results browser, explanation facilities, graph based interfaces

### Anne Monceaux - EADS ###

  * n-ary relations
  * Composite ontologies
    * OWL is useful to share data among disciplines or to build federated veiws over the information. Some objects may have diferent properties in different contexts.
    * Current approach: modularise, descriptions.
  * Complex datatypes
    * Describe characteristics of input/output of a fproduct function. or some model parameters
      * measurement units, ranges of quantity values, number of significant digits, accuracy (accepted degree of error), datatype axioms, string data-type defined via a regular expression.
  * Link to external resources
    * Mine instances and find patterns by using OWL ontology to query instances. Framework needed for eigther querying or population the ontology (mapping axioms?)


### Francois-Paul Servant - Renault ###

  * I come from RDF, does not want to restrict himself to a certain kind of reasoning. Just want to exchange data between different systems within the company.
  * Boolean expressions occur everywhere, and they are widely used at Renault. The question is how to implement it? Set operators in owl do not really replace AND and OR operators in boolean expressions. I created an external system that does the boolean operations.

  * Every variable in boolean expressions is represented by a URI. I need to exchange this kind of

Ulrike: Would a simple shell script help you? (replace AND relations to the intersection and not the complement) (Question kept for later...)

### Walter Waterfeld - Software AG ###
  * What extensions?
  * Rules, easy to understand, consistent integration of OWL and rules. Should allow scalable, efficient and robust realisations.
  * Queries for OWL. All owl features accessible and delivered, should be compliant or in the same spirit of the rule language (the basic language constructs should be the same)

  * Support established modelling practices (constraints)

  * More important
    * Simple to understand, easy to learn standards (not like current OWL, RDF, XML)
    * Extensiblity mechanisms (using standard technologies, not necessarily everything in OWL directly)
    * assistance

  * What kind of assistance?
    * Collaborating and embedding with standard technology (web service interface for reasoner, good xml serialisation.
    * Engineering tools (nissing quality: scalable, robust)
    * Users and developers do not understand logic (problem for generic system software) What to do? Hide... Explain...?


### Patrick West  (High Altitude Observatory) ###

Virtual solar/terrestrial observatories

  * Constraints
    * Instrumentation parameters, does the instrumentaiton utilise what the scientist is looking for.
  * Need tool support. Can the tools keep up with the developments. We do a lot of visualisations. In working together with scientists,They get scared, when they are confronted with the ontology. Visualisation really helps.
    * Get different ontologies, and save them as different packages (which can then be d. There might be different abstractions that we would like to use.
    * Need for interoperability between different software engineering tools. Integration with Subversion e.g. integration with Eclipse (we create java classes from the ontology)
  * Not necessarily worried about the language but whether the tools can keep up the pace?

## Discussion ##

Ulrike:
What kind of constraints would you like to express? Could you give some examples? (quiet)

Ralf:
The constraints that have been encountered can be exemplified in e.g. a situation with 4 traffic lights that can be red or green. And they have to be configured in a particular manner (they are interdependent)

?: Do we have several different definitions of costraints floating around???

Ulrike: Can I do abox assertions that might fix your problem?

Ralf: No you can't do that in OWL, you can in RSS, they are constraints on datatype values.
Ulrike: aah.

Alan Rector: Constraints are not really on the attributes, but on all four of the values: the whole situation.

Ralf: The ideas is that the individuals are characterised by owl concepts. This is a little different from standard fininte constraint reasoning.

Francois-Paul: want to express any boolean expression as constraint. It is a tree with OR and AND...

Ulrike: Do you not like the 'sound' of the OWL
Francois-Paul: you want me to use set operators?

?: Well ... in owl it is just composition ...

Rob Shearer: If you are not using OWL then you are not really getting anything... It is really just an interchange format that you are looking for.

Boris: Are your constraints in the sense of constraint satisfaction?
Renault: exactly.

Renault: I want to use owl as an exhange language without any reasong capabilities.

Rob S.: I find this interesting, a requirment from industry: we just want an exchange language.

Bijan: You want to do propositional logic, and as OWL really is a superset of propositional logic, you should actually be able to do this. Would a syntax help to sell the solution?

Olivier (working with technical documentation): when will industry go to OWL... my experience is in SGML. When we switched to XML and we were studying RDF we found that XML was still hiding the extra information in the documents (our main study area). Most of the knowledge is lost when we set up DTD schemas for the documents. OWL is very useful for creating descriptions, and we now have a lot of data, but the DTD is useless. We are now doing very basic reasoning over our data, but before we were not doing any reasoning. (has a demo to show how the documentaiton can be integrated within the information system: show the move from human oriented documentation to information/knowledge integration).

Ralf: you mentioned that you need 'basic' reasoning. What does this actually mean? Do you need a less expressive language, or would you rather have incomplete reasoning.

Olivier: people working with data do not care at all for logic
Ulrike: do they care for precision and recall?
Olivier: they just want to find/read the data. We do not need perfect things, but we need better things. In our situation OWL is much better than XML.

Ian: Would it be a bad thing if the system said 'no the plane will be perfectly fine' and the plane will crash immediately after it takes off ;)
Olivier: We never trust the computer
Ian: You like the answers to be really the right ones, so you do care for precision and recall.
Olivier: But the people still read the PDF. Incorrect answers are not necessarily bad, it is just an advice.
Ian: But still people would like to have good/correct advice...
Rob S. (?): You would at least want to make 'some' statement about completeness: a measure of how complete the answer will be?
Olivier: right.

Francois-Paul: we do not need the information now, but later is good as well.

Ulrike: what does it mean if you say 'we have semantics' if you don't use a reasoner to get it out?
Francois-Paul: We write programs ourselves as well. When people can read the 'data' easier than in XML or PDF, it will be easier for me to write the program.

Bijan: conceptual modelling seems fine for that purpose. I sometimes use it as well for certain purposes.

Glen Hart:  people beginning to realise the value of semantics. If you want OWL to be generally accepted, you need a at least a limited level of acceptance even if people do not immediately understand it.

Henson Graves: The proof need not be completely automatic, just the knowledge 'there is a proof' is enough.

Ulrike: But if there's a button 'give it a try' you would like to push it.

Boris: OWL is also useful without reasoning. UML with URI's, with a nice serialization, and for use in various tools.

Patrick West: We are starting to begin some reasoning... within some time constraint. We are introducing the scientists to the concepts of semantics. They are used to a 'flat' representation, but now when people start getting used to the more structured view they really start seeing the value.

Glen Hart: People tend not to initially see the value of more complex reasoning, but once they get acquainted they will want to use it more.

Bijan: Use is 'selling' OWL to people. OWL is now so much better than DAML+OWL.

?: Many requests for increased expressivity. Do you think this would impact scalability etc. ?

Henson Graves: I hope we can get both... scalability can be even more important than the constraint rules. But I still say you need to increase expressibility in some areas. I am willing to trade in some aspect...

Ian: Expressive power... concerning the example Ralf was giving. Often extending the underlying representaiton language might makes more complex. Instead one could also extend or change the query languag.

Ralf: You can use queries as some kind of integrity constraints. The example given is more inference oriented... you can infer the colour of the other three traffic lights from the knowledge of one traffic light. Rather than satisfyability checking, value retrial is the main issue.

IBM Watson: we are working on a scalable reasoner, I'll give a demo, it can do reasoning on very large aboxes (60 million assertions) in SHIN.

**closing**





