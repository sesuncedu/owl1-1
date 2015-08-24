**Disclaimer:** I don't know who some of the speakers were during the Q&A (nor who was the chair of the session). Please! somebody! fix!
And... I might have gotten some of the details of the ILP talk/questions wrong as well. (just so you know)

### Extracting Modules from Ontologies ###
Bernardo Cuenca Grau


Ontology design is a time consuming task.. if you want to import only part of an ontology O.
  * find a fragment of the ontology -a module- that captures the meaning of thexe concepts in O
  * Axioms that are irrelevant to their meaning should not be included in the module.

How?
  * Import the entire ontology,
  * Or, just copy the definitions of the set of concepts.
  * Or, copy the axioms that mention the concepts

In the last two approaches, we may be missing important information.

Question: does an import of a fragment entail the same concequences for my ontology as the import of the entire ontology.

Problem is undecidable, but we try to find a practical solution.

Devise a method for finding irrelevant axioms (these need not be included in the module). Through this method we can guarantee that we do not 'miss' any relevant ones, but we might import some irrelevant axioms.

Method can be implemented syntactically

Did an evaluation:
  * for many ontologies the modules are really really small (e.g. NCI)
  * comparison with PROMPT vs. approach. Ad hoc navigational algorithms do not guarantee correctness.


### Completing DL KB's using FCA ###
Baris Sertkaya


Want to detect missing entries in our knowledgebase: relations between claes, individuals... extend the ontology appropriately.

"Does my ontology contain everything I want?"

Using FCA and attribute exploration

Are all relevant constraints that hold in the application domain captured byu the TBox, are all individuals possibly existing in the domain represented in the ABox?

Formal Concept Analysis: cross-table of attribute/object columns/rows. From this you can create a concept lattice grouping objects (concepts) according to the attributes.
Attribute exploration is a method for acquiring knowledge by asking a domain expert. Successful in various application domains (e.g. lattice theory). Quetions are asked in a particular lexicographic order, guarantees the completeness of the resultant knowleged, and guarantees the minimum number of questions to the experts.

  * Classic FCA assumes closed world, extended to open world for use in DL KBs
  * The expert can give partially specified answers. This method still guarantees the minimum amount of questions and correctness.

Question asked -> does it follow from the TBox? -> if not ask the expert -> if it is yes, add the new GCI to the TBox -> if not, add a counterexample provided by the expert to the ABox.

This is implemented into SWOOP

Available at http://wwwtcs.inf.tu-dresden.de/~sertkaya/InstExp


### Combining OWL with RCC for Spatio-terminological Reasoning on Environmental Data ###
Rolf Grütter

Data Center Nature and Landscape. 200K data records. access requires previous knowledge (terminologies).

Typical query: which are the biotopes natural interst in Birmensdorf or neighboring communities?

Objective: provide access to non-expert users.

Represent thematic notions (OWL) and spatial relations (using RCC) in a semantic layer. Using automatic agents to assist users with searches.

Question: Is this efficient?

RCC: Region Connection Calculus. Regions support either spatial or temporal interpretation.

RCC Tree (5-level subsumption tree): SR (spatially related), O (overlap), DR (discrete from), ONE, PO (partial overlap), PP/PPi (proper part), EQ (equal to), TPP/TPPi (temporal proper part), NTPP/NTPPi. (see presentation)

RCC axiomatizes spatial relations in FOL.

The allowed combinations between relations can be straightforwardly represented in a table. These tables are used to check spatial consistency of knowledge bases.

Straightforward approach: if RCC is expressible in OWL, we can then reduce spatial reasoning to terminological reasoning.

Problems:
  * Definitions of RCC relations cannot be represented in OWL/OWL1.1
  * Inferences from composition tables cannot be represented.

Workaround:
  * Connections between regions must be asserted in terms of RCC-8 and not as primitive relations (this assumed foregoing computation)

-> A hybrid knowledge representation system architecture.

RCC relations are object properties, assertions in terms of rc are in the ABox. These assertions are based on reasoning on the composition table in a separate RCCbox.

### Reasoning with OWL-DL in Inductive Logic Procramming ###
Francesca A. Lisi

ILP is an intersection of Logic Programming and Machine Learning.
Previously only in horn knowledge, now also interest in other fragments of logic.

  * The background knowledge often is not around a well-founded conceptual framework
  * The use of special-purpose reasoners are problematic and a big challenge.

AL-Quln
  * implements a general framework for learning rules on top of ontologies. Representation AL-log (Donini et al. 1998)
Frequent pattern discovery at / levels of description granularity 1 ≤ / ≤ maxG.

  * KB is composed of taxonomic ontology and a relational datasource.

e.g. used for learning from the CIA World Fact Book.

Given some reference concept (in the taxonomy), and a language of patterns with a maxG (Concepts and Properties).

The KB encompasses the ontological component. The BG-knowledge plays a key role: queries can be checked wrt. the background knowledge. (boils down to query answering).

The ILP system is implemented in Prolog, ues a Datalog + Object Identity bias (datalog with inequalities).

We need to reformulate the constraint resolution to Datalog OI SLD resolution. How to deal with the satisfiability tests?

Saturation step: reformulation widely used in ILP which aims at completing the observation with some background knowledge (often makes implicit knowledge explicit)

derives concept assertions from the OWL ontology (instance retrieval problems), translates these derived assertions into Datalog.

Saturation is implemented as preprocessing (OWL2Datalog). The module interacts with a DIG Server (Pellet)

Make concept/instance retrieval queries for each level in the ontology to be used for evaluating the patterns.

Conclusions & Future Work
  * Thanks to Pellet/Dig, the ILP system AL-QuIn is made compliant with the latest developments in KE, uses a special purpose reasoner (for OWL).
  * It is an engineering solution bepause it promotes the reuse of existing systems, and the adherence to standards.

  * Still needs to be compared with other ILP systems able to deal with OWL/DL ontologies (as soon as they are available)

## Discussion ##

Ulrike: The RCC modeling, did you think about modeling your regions using concrete datatypes. Did you have a look at this?


Rolf: We considered other work, but decided not to follow this approach. Regions share a double nature: they could be represented in a concrete domain, but not in OWL. Regions in our application are also individuals, you need to be able to classify them according to their kinship in a particular ontology. Doing both is not very nice.
Another reason is that the RCC is not intended to be represented in a concrete domain. The inventors introduced the RCC as a kind of qualitative reasoning instead of more quantitative approaches done by special database engines.

Ulrike: Would think that you would have these regions in some form of data, and you would then need to represent them to some form of logic.

Rolf: I wish there were, perhaps it exists in a commercial setting.

Ulrike: the work done by Ralf (et al.) might be interesting.


..: have you also had feedback in practice of your systems?

Baris: We've tried with small examples, and we hope that some Biologists will make some experiments (for 14 ontologies)

Bernardo: We have also biologists, and they have seen it (they want it)

Ralf: Concerning the FCA-talk, it seems to me that the set attributes that you use is fixed. If you have some attributes under a class C, this might mean that you would like to introduce some kind of 'glued' properties

Baris : In some application domains this is indeed the case to add some new properties. Instead of adding new objects, add new properties (fixed objects)

? : How far the results limited as compared to e.g. the prompt-plugin Protege?

Bernardo: Prompt is only syntactic, it does not guarantee correctness. With prompt you end up extracting most concepts out of an ontology: it is very coarse grained.

? : Is there already some release?

Bernardo: Not yet, but shortly?

? : What does shortly mean?

? : Are there any problems with the DL underlying the system?

Francesca: As far as I know. The integration in AL-Log is good enough to have a DL part without having any trouble. There is no interaction between the two parts. The kind of interaction is the one defined in AL-Log. It's a safe interaction.













