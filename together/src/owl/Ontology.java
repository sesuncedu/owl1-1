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
     * @supplierRole directlyImportsDocuments
     * @directed
     */
    URI directlyImportsDocuments;
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
