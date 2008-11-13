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
     * @associates <{Axiom}>
     * @supplierCardinality *
     * @supplierRole axioms
     * @directed
     */
    Set axioms;
    /**
     * @associates <{Annotation}>
     * @supplierCardinality *
     * @supplierRole ontologyAnnotations
     * @directed
     */
    public Set ontologyAnnotations;
    /**
     * @associates <{Ontology}>
     * @supplierCardinality *
     * @supplierRole importedOntologies
     * @directed
     */
    Set importedOntologies;
}
