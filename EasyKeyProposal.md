The OWL WG has taken up this work, so, for the nonce, work is happening [over there](http://www.w3.org/2007/OWL/wiki/Easy_Keys)

# Introduction #

Keys (aka, inverse functional datatype properties) are clearly of vital importance to many applications. Key reasoning in general in the context of OWL can be unfeasibly difficult (given what we currently know and anticpate) or even undecidable. However, general inverse functional properties are often overkill for a lot of applications. Instead of tackling the general problem, we propose a restricted version which meets important use cases. We aim for robust implementations quickly, so are willing to forgo feasible features that unduely complicate the implementation (as far as we can currently tell). As our implementation knowledge advances, we can update the spec to cover more features.

# Basic details #

Easy Keys should be:
  * Useful enough to be worth specifying
  * Low impact on implementations
  * Clear enough to specify

Often, applications merely require a key checking on explicit data (i.e., named individuals and known key values). This alone is a big and effective reduction in expressivity since it allows us to (mostly) use DL Safe rules to specify key semantics. DL Safe rules degrade graceful as we step down the overall expressiveness of the langauge, making this spec useful for RDF + rules implementations.

Keys in general have (or may have) the following properties
  1. Missing key values raise an error (optional; non first order)
  1. Functionality constraints on keys (optional)
  1. If X and Y have the same key values y, then X=Y. (essential; this is what it is to be a key!)

The first feature is not expressible directly in first order logic, thus not in OWL or OWL + DL Safe rules. So we forgo this for the moment. Functionality can be expressed in OWL and degrades to the known individual/value case just fine.

The third feature can be expressed as a DL Safe rule (assuming safety restrictions on datatype atoms), e.g., the following DL safe rule expresses that `keyProperty` is a key property:

> `  keyProperty(X, K), keyProperty(Y, K) -> X = Y. `

Key properties can be restricted to certain classes, e.g., the following DL safe rule expresses that `keyProperty` is a key property for the class `aClass`:


> `  keyProperty(X, K),  keyProperty(Y, K), aClass(X), aClass(Y) -> X = Y. `

# Compound Keys #

We can extend this definition to compound keys. For example, assume we want to express that  having the same SS# _and_ being the same age (since, who knows, we might reuse SS# every year, or every generation) implies being the same individual (that is, we want to say that `ss` and  `age` act as a compound key). We can do this using the following DL safe rule:

`ss(X, K1), age(X, K2), ss(Y, K1), age(Y, K2) -> X = Y.`

If we can make sense of builtins, then we can go further and allow computed keys of various forms. The potentially tricky bits there are:
  * What exactly the DL Safety restriction means here. Intuitively, we'd want any builtins to need _ground_ arguments, so that they are only verifying a simple relation, rather than solving a constraint problem.
  * Prevelance of builtins.
  * Computability of builtins.

# Restrictons #



# Syntax #

Because of the various restrictions, it seems reasonable to introduce special syntax for key properties so that people don't inadvertantly violate the restrictons, or when they wish to risk it, it is clearly indicated.