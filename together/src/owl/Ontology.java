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
     * @associates <{Axiom}>
     * @supplierCardinality *
     * @supplierRole axioms
     * @directed
     */
    Set axioms;
    /**
     * @associates <{Annotation}>
     * @supplierCardinality *
     * @supplierRole annotations
     * @directed
     */
    public Set annotations;
    /**
     * @associates <{Ontology}>
     * @supplierCardinality *
     * @supplierRole importedOntologies
     * @directed
     */
    Set importedOntologies;
}
