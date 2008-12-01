package owl;

import java.util.*;

class Ontology {
    /**
     * @supplierCardinality 0..1
     * @supplierRole ontologyIRI
     * @directed
     */
    IRI ontologyIRI;
    /**
     * @supplierCardinality 0..1
     * @supplierRole versionIRI
     * @directed
     */
    IRI versionIRI;
    /**
     * @supplierCardinality *
     * @supplierRole directlyImportsDocuments
     * @directed
     */
    IRI directlyImportsDocuments;
    /**
     * @associates <{Ontology}>
     * @supplierCardinality *
     * @supplierRole / directlyImports
     * @directed
     */
    Set directlyImports;
    /**
     * @associates <{Ontology}>
     * @supplierCardinality *
     * @supplierRole / imports
     * @directed
     */
    Set imports;
    /**
     * @associates <{Annotation}>
     * @supplierCardinality *
     * @supplierRole ontologyAnnotations
     * @directed
     */
    public Set ontologyAnnotations;
    /**
     * @associates <{Axiom}>
     * @supplierCardinality *
     * @supplierRole axioms
     * @directed
     */
    Set axioms;
}
