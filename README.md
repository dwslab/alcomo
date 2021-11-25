# ALCOMO

This is a fork of the ALCOMO (Applying Logical Constraints on Matching Ontologies)
tool. You can find the original code base on [ALCOMO's Web site](https://web.informatik.uni-mannheim.de/alcomo/).

ALCOMO was originally invented and developed by Christian Meilicke.

**Citation**
```
Christian Meilicke. Alignment Incoherence in Ontology Matching. University Mannheim 2011.
```

## Changes Introduced in this Fork
- Refactoring to a maven project.
- Fixed JavaDoc to be compliant, minor documentation fixes.  
- Refactoring from `log4j` to `slf4j`.
- Upload to maven central.

## Project-Specific Documentation

### Creating a New Release for Maven Central
- `mvn release:prepare -P alcomo-release`
- `mvn release:perform -P alcomo-release`
