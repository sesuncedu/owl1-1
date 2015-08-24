# Rationale #

Annotation are a key part of many ontologies. Often, the either point of an ontology is to manage the annotations on terms, but annotations may be used by editing tools (e.g., author, time modified, etc.), or for semantic extensions (.e.g, P-SHOIN), or for supporting analysis (e.g., Ontoclean).

In OWL 1.1, both entities (class, properties, etc.) and axioms can have annotions, but these have no defined semantics and little defined structuring. For example, annotationUris, as with OWL 1.1, can not form a property heirarchy.

# Some issues #

  * Semantics: Annotations have "no" semantics. In particular, a reasoner checking the consistency of an OWL 1.1 doccument is supposed to ignore them. Thus, annotations cannot alter e.g., the inferred class graph and the reasoner "cannot" do, e.g., subproperty reasoning with annotation URIs.
    * In OWL 1.1, one can change this for entity annotations by replacing entity annotations with punning. This at least gives us some way of experimenting with richer annotations.

# Features #

  * Extended Axiom Annoations: I.e., multiple distinct annotations on an axom. (For example, there might be two comments from different people on the same axiom.)

# References #
  * [Making Metalogical Information in Ontologies Logical Using Metaviews](http://www.cs.man.ac.uk/~bmotik/metaviews/paper-full.pdf)

# People #

  * Joanne Luciano
  * Bijan Parsia