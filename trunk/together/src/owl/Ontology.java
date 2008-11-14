package owl;

import java.util.*;

class Ontology {
    /**
     * @supplierCardinality 0..1
     * @supplierRole ontologyURI
     * @directed
     */
    URI ontologyURI;
    /**
     * @supplierCardinality 0..1
     * @supplierRole versionURI
     * @directed
     */
    URI versionURI;
    /**
     * @supplierCardinality *
     * @supplierRole directlyImports
     * @directed
     */
    URI directlyImports;
    /**
     * @associates <{Ontology}>
     * @supplierCardinality *
     * @supplierRole / directlyImportsOntology
     * @directed
     */
    Set directlyImportsOntology;
    /**
     * @associates <{Ontology}>
     * @supplierCardinality *
     * @supplierRole / importsOntology
     * @directed
     */
    Set importsOntology;
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
