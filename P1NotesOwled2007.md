# Panel 1: SPARQL, Rules and OWL ? #

## Sandro Hawke ##

  * RIF
    * RIF Core+Extensions
    * Interchange Format
      * Might be lossy if you're outside Core
      * cf import/export JPG
    * Intersection or Union of OWL + RIF?

## Martin O'Connor ##

  * SPARQL
    * Poor syntax
    * uncertain semantics
    * Not a rule language
    * RDF not OWL based
    * Exposes too much
    * No standard extension library
  * SWRL
    * Clean syntax
    * Clear semantics (?)
    * OWL DL based from birth
    * Extension via built-ins

## Boris Motik ##

  * Should distinguish queries from rules
  * Queries
    * Can define queries via relation algebra
      * Manipulating Consequences
    * Semantics not controversial
  * Rules
    * Different focus
    * Main purpose is to derive new facts
    * Semantics is controversial
      * Open vs. Closed world reasoning
  * What to do
    * Take SPARQL and fix it.
      * Negation
      * Universal quantification
    * Make semantics on OWL unambiguous.
  * Integrating OWL and Rules will be easier if we first extend OWL with ICs

## Bijan Parsia ##

  * Trends in papers
    * Needs
    * Use
    * Possibility
  * Rules, constraints and queries are what people want

## Ricardo Rosati ##

  * KR Glasses
    * Rule base is a knowledge base
    * Rules and Queries should have form (declarative semantics) and rules/queries should be interpreted w.r.t. those semantics
  * Rules and Queries
    * Query Q is a new predicate defined over the ontology
    * Rules. Definition of a set of predicates
    * Rules define predicates not in O
      * Rules ==Queries
    * Rules change the meaning of a predicate in O
      * Rules != Queries
  * Rules and OWL
    * Rules define predicates not in O
      * OWL and Rules separate
    * Rules change the meaning of a predicate in O
      * Rules part of the languages
  * Query Language
    * Relational algebra/SQL
    * But undecidable in OWL-DL
      * SPARQL-DL undecidable

## Suzzette Stoutenburg ##

  * Query as access to KB or OWL as augmentation of data source
    * OWL as semantic tier, separate from data
  * Rules and OWL
    * Well defined semantics
    * OWL and Rules together when reasoning
  * Query Languages
    * SPARQL fragile, exposes too much RDF. Would like what Bijan presented earlier
  * Rule Languages
    * Used SWRL
    * Extensibility

## Discussion ##

  * Ruttenberg: Comment on which proposals deal with query on classes. Assumption sometimes that rules operate on individuals.
    * Bijan: Yes
    * Boris: Yes
    * Ricardo: Yes, but need to study queries on ABox.
    * Bijan: How many people want it? Quite a few....
    * PFPS: Answers aren't all possible descriptions, but names of classes that you've given to the system.
    * Boris: related to metamodeling. Could then consider class queries as data queries.
    * PFPS:Updating the OWL1.1 feature list? Discussion after lunch
  * Rector: Stacks of rule formalisms. Would be useful to have a list of queres in english and formal, that showed what can and cannot be expressed in particular rule formalisms.
    * PFPS: Get a Master's student to do it. Community can then help to do it.
    * Rector: Question whether this is a Master's project.
    * Sandro: RIF started working on RIF-RAF (sp?), survey of rule systems and rule features.
  * Sattler: Imagine you have a nice rule formalism and OWL. How do you know which to use for the thing you want to say? As rule or axiom?
    * Stoutenburg: As low as possible. Only use rules when you have to. Do as much in the OWL layer.
    * O'Connor: In principle, do it in OWL if you can. But protege list suggests people do it in all kinds of ways.
    * Bijan: Student analysed rules to see if they could be rewritten to ontology. Didn't get far enough, but would be an interesting approach in general.
    * PFPS: In general a hard problem (undecidable)
    * O'Connor: Might make things less understandable
  * Hoekstra: Is this semantic or syntactic? Can't you do some translation under the hood?
    * Motik: There is a difference. Will always be some kind of safe rules. THnk of data reasoning. If you want more ansewers when querying, use ules. If it's intentional, put it in the ontology
    * Parsia: Business rules people say just write down what you need.
    * Hawke: Hear in the RIF a lot that most rule users are perfectly interested in OWL or XML schema (whcih they see as the same kind of thing) as ways of described their data.
  * Moeller: Claim that rule language and semantics also has impact on query, COnsider DL-safe rules could infer not R. Should then appear in the query language. Trigger rules then not.
    * Motik: Orthogonal.Rules rovide consequences. Query language is for dealing with consequences and combining them. Can develkope query and rul langs independently.
    * Parsie: Notice people who go from writing queryies to putting them in heads of rules. From User perspective need to be carfuel. Often people want the rules to express what they would have expressed with some code. More declarative.
    * O'Conner: Query func only available for a while Users are now using queries as they['re easire to debug.
    * PFPS: Changing query into rule body may have some subtle distinction.
  * Luciano: In response to a query can you distinguish whether it's coming from a efinition ro a rule?
    * PFPS: Does it make sense to distingushi things that come from the ont, from ont+rules or on+whatever?
    * Parsia; Yes
    * Hawke: Yes
    * O'Conner: yes, if it's possible
  * Luciano: Ruls on top of ontology. Wouldn't it be useful to knwo whether the answer comes from data, otnology or rule?
    * Stoutenburg: Express everything separately, then translate to a single system for reasoing. So couldn't distinguiush
  * Graves: Rule Use case. Use rules to express wiegght of prduct is sum of eights of components. Could be units, measured, estiemated etc. Rules to express membership. To satisfy this,. need to go out and weight things, but rule gives a precise stateent of affairs. Needs lots of pattern matching to find the evidence. Sits of top?
    * O'Connor: Counting hard because of Open World
  * PFPS: How to deal with getting run over by the SPARQL train? SPARQL is happening. How do the OWL community deal with it?
    * Bijan: People are already using, so need to support them.
    * PFPS: Same relationship as that between RDF and OWL?
    * Boris: Agree with Bijan. In a better situation that OWL &RDF. Take SPARQL and extend with an RDF free syntax. For RDF, provide a translation
    * Hawke: Don't personally care for SPARQL. WIll just use RIF as they're the same thing.
    * O'Connor: Make the tools usable as possible.
    * Stoutenburg: Should say something positive about SPARQL. Preferred it over RDQL. XML result format is easy to use. Should keep that.
    * Parsia: What we can't do is blow SPARQL off. Have to say something sensible and implement somethnig plausile. Otherwise will open lots of negative issues. If we ignore it we'll miss an opportunity to create goodwill for OWL.
  * Muthunuri: Significant differences between using queries for inferred knowledge
    * Parsia: Canonical way in SPARQL is that if you want to query the inferred stuff, flip a switch to query it under those semantics. Cf DIG proposals. Could do better, but need some feedback.
    * Hawke: related to issue of reporting how the query was answered.
  * Polleres: Consesnus that a syntactic fragment of SPARQL would be fine with OWL-DL? SPARQL-DL as a fragemet, Biros's approach with data and we're fine.
    * PFPS: SOme wrinkles if you mix ground and ntology queries