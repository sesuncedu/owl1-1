package owl;

import java.util.*;

class Ontology {
    public String ontologyURI;
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
