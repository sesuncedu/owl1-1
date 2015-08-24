(Feel free to send Bijan pointers or examples. We can host them in svn on this server, or in a number of alternative places. Tutorial style examples are welcome.)

(An updated DAML+OIL to OWL 1.1 converter would be a great thing, since we could capture all the DAML+OIL ontologies that used qualified cardinalities correctly.)

| Name | Syntax | Comment |
|:-----|:-------|:--------|
| [family.owl](http://www.owldl.com/ontologies/family.owl)| RDF/XML | Example ontology demoing OWL 1.1 features (by Evren Sirin)|
|[Galen](http://owl1-1.googlecode.com/svn/trunk/ontologies/galen-original-owl1.1.owl) ([simplified version](http://owl1-1.googlecode.com/svn/trunk/ontologies/galen-simplified-owl1.1.owl)) | RDF/XML| A version of the [Galen](http://www.co-ode.org/galen/index.php) biomedical ontology. It has some role inclusion axioms, e.g, involving the "hasLocation" property (submitted by Dmitry Tsarkov)|
| [Pump](http://owl1-1.googlecode.com/svn/trunk/ontologies/example-for-teijgeler-qcrs-apr2007.owl) example | RDF/XML | Created by Bijan Parsia in reply to Hans Teijgeler's [query](http://lists.w3.org/Archives/Public/semantic-web/2007Apr/0067.html). Note that Bijan added a nonsense min cardinality in order to make the class unsatisfiable. |
| [Pump](http://owl1-1.googlecode.com/svn/trunk/ontologies/example-for-teijgeler-qcrs-apr2007.xml) example | OWL11 XML | Same as the pump example above, only in the [XML syntax](http://webont.org/owl/1.1/xml_syntax.html). The file is valid, and it contains a declaration (only one) and an axiom comment!|

  * Several of the [ontologies](http://www.dumontierlab.com/index.php?page=ontologies) by [Michel Dumontier](http://www.carleton.ca/biology/people/dumontier.html)'s group make use of OWL 1.1 features (for example, as described in their OWLED 2007 [paper](http://webont.org/owled/2007/PapersPDF/submission_36.pdf)).