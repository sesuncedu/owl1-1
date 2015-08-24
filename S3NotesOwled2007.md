# Session3: Query Languages and Extensions #

## Adding Integrity Constraints to OWL ##

  * ICs
    * Error detection
    * Domain constraints
      * lives can only be stated for UK residents
    * Participation constraints
      * Must know where a person lives
  * OWL
    * Things handled differently in OWL., e.g. end up deriving existence of some new unnamed individual.
    * Can't model ICs in OWL
    * Makes reasoning unnecessarily complex.
  * Idea
    * ICs as in relational dbs
    * Separate TBox into standard axioms (S) and integrity constraints (C)
    * Notions of IC satisfaction and algorithms
  * Details
    * No change in TBox reasoning.
    * Axioms in S derive new facts
    * ICs model-check all available facts
  * Result
    * If ICs are OK, can throw them away for answering positive UCQs.
  * In practice
    * Model OWL Ontology as usual
    * Mark axioms as ICs
      * Expect most axioms to become ICs
    * Add ABox
    * Check IC Satisfaction
      * Efficient procedure possible
    * Answer ABox queries
      * Should be more efficient.

## Extending Fuzzy Description Logics for the Semantic Web ##

  * Fuzzy Sets
    * Usual stuff
    * Applications
      * Image Analysis
      * Geospatial apps: bus stop "close" to cinema
      * Medical apps: "high temp"
  * Fuzzy DLs
    * TBox/RBox unchanged
    * ABox assertions with values.
    * Semantics: well-defined model theoretic
    * Reasoning
      * Tableaux
      * Reduction to crips DLs
      * Mixed Integer Programming
      * Fuzzy DL-Lite
    * Implementations
      * FiRE
        * Tableaux for fuzzy SHIN
        * Connected to Sesame. Serialise fuzziness to triples
          * Query using SPARQL/SeRQL
      * Reduction
        * KAON2 fuzzy SHIN
      * Fuzzy DL-Lite with fuzzy CQs
        * OntoSearch2
      * FuzzyDL

## Can OWL model football leagues? ##

  * Motivation: Modelling football
  * Simple attempt
    * Failed to capture everything, e.g. constraints.
      * No two leagues in the same year in same nation.
      * Codes for matches are unique in round.
      * Can only referee one match per round
    * Assertions are based on identifiers
    * Can we add more expressive identification constraints?
  * DL-Lite\_A
    * Can capture conceptual modelling
    * TBox polynomial
    * Query logspace in data
    * Can use relational engine to answer queries
    * Logic fine-tune in order to guarantee nice complexity
  * Identification Assertions
    * Collection of roles identify classes
  * Reasoning
    * DL-Lite\_A + Idenfication Assertions still polynomial
    * Can derive new identification assertions
  * Implementation
    * QuOnto system

## SPARQL Query for OWL-DL ##

  * DAWG
    * Hooks for extending SPARQL with OWL
    * Gap between understanding conjunctive queries and SPARQL
    * Experience based on people writing queries and ending up with unexpected results.
  * Why SPARQL-DL?
    * Query languages for RDF/OWL
      * RDF-based
        * RDQL
        * SPARQL
        * SeRQL
        * Syntax of language and assertions mixed
      * DL-based
        * DIG ASK
        * nRQL
        * OWL-QL
      * None satisfactory for OWL-DL
    * Goals
      * Mix ABox/TBox/RBox queries
      * OQL-DL compatible semantics
      * Align with SPARQL
        * Define as entailment regime
      * Avoid implementation burdens
  * Why not SPARQL?
    * Problematic queries involving quantification over the language primitives
  * Details
    * Query atoms include subclass, equivalentclass, property etc.
    * Complex class expressions, but no variables
    * Various kinds of queries. Mixed ABox/TBox
    * Simplest thing that covers the examples they've seen.

## Q&A ##

  * Cregan: Fuzzy Reasoning. Being tall to degree 0.7. Based on some distribution of stuff. Will be different for different populations. How to integrate this difference?
    * A: Have to first measure the heights. Partition the space (fuzzily). Done outside the DL formalism. Some integration in tools
  * Rector: Boris. Constraints are against inferences. 1. Does that implky that youre counting on incremental classification, so that you're working against inferred verion
    * A: This is orthogonal. Definition of constraint satisfaction is indepent to this. Assumes from scratch.
  * Rector: Same sort of issues w.r.t classes. Limiting what can be said
    * A; Understand this, Crossed my mind but no answer ready.
  * Ruttenberg: DL Lite. In bio, need DL-Lite but also transitivity. is this know to be intractable?
    * A: Haven't looked at what happens. Have looked at extensions but not that one.  Want to explouit translation to relation dbs. Any kind of extension will loe that property. DL-Lite on the borders of tractabilbitiy.
  * Lutz: Boris. Decision to make IC part of TBox. TBox has two purposes. GCI (itentional) IC (extensions). Is this confusing?
    * A: This is a feature not a bug. Could express constraints unsing MKNF or some extension of OWL. IN db inclusion dependences and constraints. Query containment then computed w.r.t. the constraints. Data reasoning: checks. Intentional reasnoning: intensional interpreteation. Whehn Modelling, want to modelk as a normal ontology. Then when adding data, get to the second level. DB system also use your intentional constrraint to answer extensionsl queries.
  * Patel-Schneider: Can throw away IC when doing ABox reasoning. Might they be hints for th reasoner?
    * A: Couold do what dbs do and reqrite query using the ICs. Don't need them when answering.
  * Moeller: Bijan. For semantics do you use gronded queries? INdividuals bound to those explicitle menioned?
    * A: Allow for both. Syntax for distinguhishing them.
  * Parsia: Any examples of mid to larger than mid size ontologies using fuzzy stuff
    * A: Yes. Extended LUBM.
  * Parsia: ANy that don't give me the creeps?
    * A: Use case scenario. Shortly everyone will be able to see them