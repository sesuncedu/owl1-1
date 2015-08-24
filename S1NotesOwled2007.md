Presentations:
# Suzette Stoutenburg presenting: [in OWL for Rapid Enterprise Integration](http://owled2007.iut-velizy.uvsq.fr/PapersPDF/submission_2.pdfOntologies)
# Henson Graves presenting: [Ontology Engineering For Product Development](http://owled2007.iut-velizy.uvsq.fr/PapersPDF/submission_3.pdf)
# A. Ranganathan presenting: [Use of OWL for describing Stream Processing Components to enable Automatic Composition](http://owled2007.iut-velizy.uvsq.fr/PapersPDF/submission_38.pdf)
# FP Servant presenting: [Semantic Web Technologies in Technical Automotive Documentation](http://owled2007.iut-velizy.uvsq.fr/PapersPDF/submission_30.pdf)

Suzette has a demo which connects the high level semantic stuff with diverse raw data.

Suzette's folks LOVES OWL (could use more expressivity).

Updating and linking ontology "semi-automated".

Henson Graves: Background: 20 yrs building systems for product development. Past year exploring new directions for product development/life cycle support.

Long product devel cycles, with huge amounts of associated data. Where does OWL fit in? manage enterprise data and "semantic interoperability"

Constraints important (for data entry; abox/tbox completion)

A. Ranganathan: Constructing component based workflows (from web services to mashups)

Use case: extracting video for traffic flow. MAshing up audio/video etc. Data soruces producing raw data. Components take streams, produce new streams.

System S Steream Processing System. User submits query. Workflow composer passes job on to subsystem, executs w/flow.

Instance-level graph patterns (> OWL-S)

user queries in SPARQL. Not going to store, but continuous query

AI Planning to construct workflows.

Streams described using exemplar packets, e.g. vide seg+time interval. Assertions describing the individual (A-box assertions)

Components described using graph patterns. E.g. video stream pattern -> image pattern. Input must have video seg+time interval. Output has to have image an time. Constraints on the input (where it comes from etc). Constraints on the relationship between the resulting image.
Richer than class based descriptions.

COnditions for determing whether a stream can be input toa component. "Syntactic" and "Semantic" checks.

Conclusions:
**RDF/OWL for describing streams** Use of exemplars to described properties of packets
**ABox assertions to describe a class rhather than TBox**

Other stuff: Planner Model driven approach. Collaborative Ontology Engineering

== FP Servant. Semantic Web Technologies in Technical Automotive Documentation
Work at Renault on using SW. ==

RDF Bus for sharing information

Use case: diagnostic/repair documentsation. Lots of systems. Engineering to repair shops.

Probabilistic induction tool. Local technology. Hard stuff off line, so good performance at run time.
Diagnostic procedures currently written in manuals -- engine would allow computation on the fly. But data not available (at required levels). No repository of diagnostics. Systems can't interoperate.
Goal: Buold a repository and demonstrate vaule through diagnostic engine.
Concepts modelling using OWL.
REST architecture.

Modelled domain artefacts + cosntraints probabilities etc.
OWL Full ((they didn't care about reasoning -- using their onw tools).

Use Care; A/C broken. connect device to car and read default trouble codes. repository provides information about the code and related components. Tests may then need disassembly, which incurs a cost. Engine calculates best order for tests. VIN number used as context. Report then gives plan with probabilities for fault.

### Conclusions ###
**OWL isn't extra work -- needs to be done anyway. Allowed them to put business knowledge into the data.** Issues to do with modelling boolean expressions?
**SW still not in the mainstream, but their goal is to show that Renault can produce the data in RDF/OWL.
Bijan: OWL Full. Classes as instances. Any non metamodelling features?**

Servant: Could have stuck to OWL-DL, but would have been more work.

Bijan: would punning have met your needs?
A: Not sure. Didn't really consider the question or check whether DL use was possible.

PFPS: If you're using OWL Full, what fullishness are you using? For any application

Servant: DL as i/f to DL reasoners. He's not using that so who cares?

Ralf Moeeler: How important is reasonign?> What problems do you want solved?

Suzzette: Critical. Needs to integrate ontologies/rules into a single KB. Chakllengin.

Graves: Reasoning important. proof checking. Well defined semantics is vital. Capabiklit of reasongers is less inporant

Ranganatahn: Yesy. deciding if a stream can be matched to a components. Context Things true in the context of a particualr stream or message. Context for an assertion or axiom.

Servant: Main job is reasoning tools. Prop calculus. Probabilistic aprpoach based on the same structrus. Reasoning at the center of what hye're doing.

Horrocks: Say more about the tools you're using? Are you satisfied? What more do you want?

Suzzette: Proetege. Cerbera construct. Frustrrated with limitations. Thne used XML tools. Now using TOpBraid. Want integrated suite of tools. Connect to web services. Manage data all the way to apps.

Graves: Mostly XML tools and prolog reasoners. Transsiton

Ranganathan: Protege 3.2 beta. Problem with OWL using http URIs. Using BOCA distributed access to RDF store. DLP SOR from IBM.

Servant: Protege. Plus some hacking. want a

Ranganathan: Good N3 (??) editing tools. Globale text search/replace.

Biajn: Not just good textual tools, but formats that work with tools. Issue for later.

Suzette: Also using prolog as reasoner. Translation OWL/SWRL-> prolog. Mostly OWL Lite featuer