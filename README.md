## The Spring Boot blog is a dynamic and scalable web application that leverages the power of Spring Boot

### Best Practices
* Do not use wildcard imports
    * In the Settings/Preferences, Editor | Code Style | Java | Imports.
    * Make sure that the Use single class import option is enabled.
    * In the Class count to use import with '' and Names count to use static import with '' fields, specify values that definitely exceed the number of classes in a package and the number of names in a class (for example, 999 ).
* "Optional" can be used as a return type for repository methods to indicate that a null value will be returned in the case of a non-existent entity.
* Folder name in strıcture should be singular -> "entity" not "entities"