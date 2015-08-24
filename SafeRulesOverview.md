# Introduction #

The general idea of Safe Rules for OWL is to add rules to OWL in a way
that does not lead to undecidability and also provides a good chance of
effective implementation.  The main approach to achieving this has been
via DL-Safe rules.

There are several options that one could think of in adding rules to
OWL:

  * Should the rules be Horn rules or disjunctive rules?
> > It seems that a conservative stance is just to start with Horn rules.
  * Should the rules have n-ary predicates, as opposed to just unary predicates (classes) and binary predicates (properties)?
> > As the idea is to maintain implementability, it seems that just unary and binary predicates are the best way to start, except for n-ary datatype predicates (if these are added to OWL).
  * Should the rules have a distinction between OWL and non-OWL predicates?
> > As the rules are likely to be used in situations where the OWL portion may be extended, it seems difficult to reserve some predicates as non-OWL predicates.
  * Should the rules have variables that range over datatypes?
> > As OWL has datatypes, it seems obvious that this should be allowed.
  * Which version of safety should be allowed - the orginal one (DL-safety) or the newer one (weak safety)?
> > DL-safety is more conservative and thus may be better to start with.

One consequence of not dividing predicates into OWL and non-OWL is that
safety has to be obtained by restricting non-datatype variables to the
individual names in the ontology.  (This is the same as using a special
non-DL predicate, O, that has been asserted only for indiviudal names.)

Allowing in datatypes means that obtaining decidability becomes slightly
more difficult.

As far as syntax goes there are several options open.  The rules could
use the XML syntax utilized in SWRL.  Alternatively, the rules could
abide by the new XML syntax for RIF rules.  Given that RIF is probably
going to be a W3C recommendation it makes sense to go with the RIF
syntax, except that the RIF syntax is extremely verbose.   The RIF
presentation syntax, on the other hand, is actually quite nice and
compact, particularly if the Forall construct around the rule is
removed.

# An Example of the Various Syntaxes #

### Example rule in RIF presentation syntax ###

```
  Forall(?x (Teenager(?x) :- And(Person(?x) age(?x,"15"^^xsd:integer))))
```

### Example rule in RIF XML syntax ###

```
<rule>
  <Forall
    <declare><Var>x</Var></declare>
    <formula>
      <Implies>
        <if>
          <And>
           <formula>
              <Uniterm><op>Person</op><arg><Var>x</Var></arg></Uniterm>
            </formula>
            <formula>
              <Uniterm><op>age</op><arg><Var>x</Var></arg>
                <arg><Const type="xsd:integer">15</Const></arg>
             </Uniterm>
            </formula>
          </And>
        </if>
        <then>
          <formula>
            <Uniterm><op>Teenager</op><arg><Var>x</Var></arg></Uniterm>
          </formula>
        </then>
      </Implies>
    </formula>
  </Forall>
</rule>
```

### Example rule in SWRL abstract syntax ###

```
  Implies(Antecedent(Person(I-variable(x)) age(I-variable(x,"15"^^xsd:integer)))
          Consequent(Teenager(I-variable(x))))
```

### Example rule in SWRL XML syntax ###

```
  <ruleml:imp>
    <ruleml:_body>
      <swrlx:ClassAtom>      
        <owlx:Class owlx:name="Person" />
        <ruleml:var>x</ruleml:var>
      </swrlx:ClassAtom>      
      <swrlx:datavaluedPropertyAtom swrlx:property="age">      
        <ruleml:var>x</ruleml:var>
        <owlx:DataValue owlx:datatype="xsd:integer">15</owlx:DataValue>
      </swrlx:datavaluedPropertyAtom>      
    </ruleml:_body>
    <ruleml:_head>
      <swrlx:ClassAtom>      
        <owlx:Class owlx:name="Teenager" />
        <ruleml:var>x</ruleml:var>
      </swrlx:ClassAtom>      
    </ruleml:_head>
  </ruleml:imp>
```

# Semantics #

The semantics of safe rules for OWL is determined by the semantics of
DL-Safe rules, so the rules are treated as disjunctions where object
variables can be instantiated as individual names that appear in the
ontology or the rules and datatype variables can be instantiated as
data values that appear in the ontology or the rules.

This is consistent with the semantics of RIF rules, provided that the
special literal O(x) is added to rules for each individual variable in
the rule and O'(x) is added to rules for each datatype variable in the
rule.  Neither O nor O' appear in the ontology.  O(x) is true for
individual names that appear in the ontology or the rules.  O'(x) is
true for data values that appear in the ontology or the rules.

# Proposed Solution Summary #

The proposal for Safe Rules for OWL is thus to have Horn rules with
unary and binary predicates interpreted according to the DL-Safe rules
semantics with individual variables restricted to individual names
appearing in the ontology or rules and datatype variables restricted to
values appearing in the ontology or rules.

The exchange syntax will (reluctantly) be the RIF XML syntax.  The
presentation syntax will be the RIF presentation syntax with the option
of leaving out enclosing universal constructs.



# References #

## Main References ##

  * Harold Boley and Michael Kifer, editors. RIF Basic Logic Dialect. W3C Working Draft 30 October 2007. http://www.w3.org/TR/rif-bld

  * Ian Horrocks, Peter F. Patel-Schneider, Harold Boley, and Said Tabet. SWRL: A Semantic Web Rule Language. Benjamin Grosof, Mike Dean. W3C Member Submission 21 May 2004. http://www.w3.org/Submission/SWRL/

  * Boris Motik, Ulrike Sattler, and Rudi Studer. Query Answering for OWL-DL with rules. Journal of Web Semantics, 3(1):41-60, 2005. http://web.comlab.ox.ac.uk/oucl/work/boris.motik/publications/mss05query-journal.pdf http://www.sciencedirect.com/science?_ob=MImg&_imagekey=B758F-4GDSF2D-1-158&_cdi=12925&_user=126524&_orig=browse&_coverDate=07%2F31%2F2005&_sk=999969998&view=c&wchp=dGLbVzb-zSkzV&md5=c259573307aff03dee9f17f520c295fb&ie=/sdarticle.pdf
> > (DL-safe rules, longer journal version)

  * Boris Motik, Ulrike Sattler, and Rudi Studer. Query Answering for OWL-DL with Rules. In Sheila A. McIlraith, Dimitris Plexousakis, and Frank van Harmelen, editors, Proc. of the 3rd Int. Semantic Web Conference (ISWC 2004), volume 3298 of LNCS, pages 549-563, Hiroshima, Japan, November 7-11, 2004. Springer. http://web.comlab.ox.ac.uk/oucl/work/boris.motik/publications/mss04dl-safe.pdf
> > (DL-safe rules, original version)

  * Riccardo Rosati. DL+log: Tight Integration of Description Logics and Disjunctive Datalog In Proceedings of the Tenth International Conference on Principles of Knowledge Representation and Reasoning (KR 2006), pages 68-78, 2006. ISBN 978-1-57735-271-6.
> > (weak DL safety)

## Other references ##

  * Boris Motik and Riccardo Rosati. A Faithful Integration of Description Logics with Logic Programming. In Proc. of the 20th Int. Joint Conference on Artificial Intelligence (IJCAI 2007), pages 477-482, Hyderabad, India, January 6-12 2007. Morgan Kaufmann Publishers.

  * Boris Motik, Ian Horrocks, Riccardo Rosati, and Ulrike Sattler. Can OWL and Logic Programming Live Together Happily Ever After? In Isabel F. Cruz, Stefan Decker, Dean Allemang, Chris Preist, Daniel Schwabe, Peter Mika, Michael Uschold, and Lora Aroyo, editors, Proc. of the 5th Int. Semantic Web Conference (ISWC 2006), volume 4273 of LNCS, pages 501-514, Athens, GA, USA, November 5-9 2006. Springer.

  * Riccardo Rosati. On the decidability and complexity of integrating ontologies and rules. Web Semantics, volume 3, number 1, pages 41-60, 2005.

  * Riccardo Rosati. Semantic and Computational Advantages of the Safe Integration of Ontologies and Rules. In Proceedings of the Third International Workshop on Principles and Practice of Semantic Web Reasoning (PPSWR 2005), Lecture Notes in Computer Science, volume 3703, pages 50-64, Springer, 2005.