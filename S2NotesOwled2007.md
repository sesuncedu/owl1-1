# Session 2: OWL and Rules in Applications #

## VIVO Development Roadmap: Enhancing an Ontology-Based University Research Portal with OWL and Rules ##

  * Ontology Based Portal
    * Full text search
    * Browsing ontology
    * Home rolled schema for ontology structure and instance data
    * Custom system under tomcat. Lucene, mysql, tomcat
    * Simple RDFS level semantics
    * Works fine.
  * Needs
    * Model gets more complex.
    * Show/hide individuals in different portals. Infer from assserstions/properrties
    * Eliminate messy primitives
    * Match user expection
    * Subtopic
  * Challenges
    * Sunrise/sunset triples
    * Reification (urgh)
  * Current OWL stuff
    * VIVO data acess using Jena

## Implementing an RDF/OWL Ontology on Henry the III Fine Rolls ##

  * Fine Rolls digital resource
    * Record offers of money to the king.
    * Representing information present in the rolls
    * Rolls marked up as TEI XML
      * Physical structure
      * semantic content
    * Print + Digital
  * Challenges
    * Expression relationships between things, e.g. people and places
  * Ontologies
    * CIDOC, CRM, SKOS
    * Structure and enriched index for the subjects.
      * XSL transformations to produce index.
  * Remarks
    * Synchronization of data

## Rule-Based Reasoning With A Multi-Scale Neuroanatomical  Ontology ##

  * Neuroscience
    * Swimming in a sea of data. Different modalities, different scales.
    * Spacial from micrometer to cell level, electron microscopy.
    * Want to integrate other stuff
      * owl:imports pulling things in together.
    * Problem in tracing due to granularity.
  * Rule based queries
    * Algernon
    * Generate inferred instances from existing ones.
  * Remarks
    * OWL ontologies for sharing data
    * Merging ontologies enables synthesis of data across scales and modalities.
    * Glue unifying multiple representations

## Using SWRL in Clinical Applications ##

  * Protege using SWRL
  * Clinical Trials
    * SWRL generating XML
  * HIV Treatment
    * Web service support via SWRL
  * Ontology Mapping
  * Requirements
    * Ontology query.
    * Using SWRL rather than SPARQL (OWL rather than RDF)
  * SWRL and Querying
    * Temporal queries
    * TBox Queries
    * ABox Queries
  * Plans
    * SQWRL
      * OWL Restrictions in queries
      * Disjunction
      * Negation

## Q&A ##

  * Horrocks:What tools>
    * Stanford: Protege
    * Protege3  + Oxygen
    * Protege + own tools
    * Protege 3 and custom tools. XML.perl.
  * Ruttenberg: Example of rules in bridging ontologies?
    * If you have an axon terminal and its origin is the thalamus then you have an axon whos origin is the thalamus.
    * Q: Used the rules because OWL didnt support that? Yes.