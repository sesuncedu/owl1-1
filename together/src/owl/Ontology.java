package owl;

import java.util.*;

class Ontology {
    /**
     * @supplierCardinality 0..1
     * @link aggregation 
     * @clientRole ontologyURI
     * @directed*/
    URI ontologyURI;
    /**
     * @link aggregation
     * @associates <{Axiom}>
     * @associationAsClass <<set>>
     * @supplierCardinality *
     * @clientRole axioms
     * @directed
     */
    public Set axioms;
    /**
     * @link aggregation
     * @associates <{Annotation}>
     * @associationAsClass <<set>>
     * @supplierCardinality *
     * @clientRole annotations
     * @directed
     */
    public Set annotations;
    /**
     * @link aggregation
     * @associates <{Ontology}>
     * @associationAsClass <<set>>
     * @supplierCardinality *
     * @clientRole importedOntologies
     * @directed
     */
    public Set importedOntologies;
}
