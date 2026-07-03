# Cucumber-Framework-BDD-Test-Project

Automated testing script using Java, Selenium, and Cucumber with BDD (Behavior-Driven Development) approach.
- **Domain**: E-commerce testing
- **Framework**: Cucumber + Selenium + JUnit
-- **Language**: Java 17+

## Project Updates (Latest)

This project has been updated to resolve configuration and compatibility issues:

### Key Changes Made:
1. **Java Version**: Updated from Java 1.7 to Java 17 (project configured to use Java 17)
   - Updated `pom.xml` compiler properties (source, target, release) to 17
   - Updated `.classpath` JRE container to JavaSE-17
   
2. **Dependencies Fixed**:
   - Added missing `commons-io` dependency (2.13.0)
   - Added missing `log4j-api` dependency (2.23.1)
   - Removed duplicate `cucumber-junit` dependency
   
3. **Build Configuration**:
   - Added Maven Compiler Plugin (3.10.1)
   - Added Maven Surefire Plugin (3.0.0-M9) for test execution
   - Added Maven Failsafe Plugin (3.0.0-M9) for integration tests
   
4. **Hardcoded Paths Fixed**:
   - Replaced all hardcoded user paths with project-relative paths
   - Updated `BaseClass.java` to use `System.getProperty("user.dir")`
   - Updated `JVMReport.java` to create report directories dynamically
   - Updated `RunnerClass.java` feature and plugin paths
   - Updated `Hooks.java` screenshot path
   
5. **Logging Configuration**:
   - Added `log4j2.xml` configuration in `src/test/resources/`

## Prerequisites

- **Java**: JDK 17 or higher (or ensure your CI uses a compatible Java version; you can set `maven.compiler.release` to 11 for broader compatibility)
- **Maven**: 3.6.0 or higher
- **Git**: For cloning the repository

## Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/Mugesh0123/Cucumber-Framework-BBD-Test-Project-1-.git
cd Cucumber-Framework-BBD-Test-Project-1-
```

### 2. Install Dependencies
```bash
mvn clean install
```

### 3. Compile the Project
```bash
mvn clean compile
```

### 4. Run Tests
```bash
# Run all tests
mvn clean test

# Run specific test runner
mvn -Dtest=RunnerClass test

# Run tests with skip
mvn clean test -DskipTests=false
```

### 5. Generate Reports
JVM reports will be generated in: `AllTestReport/jvm-report/`

Screenshots will be saved in: `screenshots/`

Test reports:
- JSON Report: `AllTestReport/json-report/reports1.json`
- JUnit XML Report: `AllTestReport/junit-report/reports2.xml`
- Extent Reports: `target/cucumber-report/extent.html`

## Configuration

### Feature Files
Located in: `src/test/resources/featureFile/`
- book.feature
- computer.feature
- Electronics.feature
- Jewelry.feature (default tag: @Jewel)
- Login.feature
- searchProduct.feature

### Test Properties
Configuration file: `properties/config.properties`
- Contains test data and URLs

### Logging
Configuration file: `src/test/resources/log4j2.xml`
- Logs output to console and `logs/app.log`

## Project Structure

```
Cucumber-Framework-BBD-Test-Project-1-/
├── src/
│   └── test/
│       ├── java/test/
│       │   ├── baseclass/        # Base test class with common utilities
│       │   ├── hooks/            # Cucumber hooks (Before/After)
│       │   ├── pageobjectmanager/ # Page Object pattern manager
│       │   ├── pojoclass/        # Page Object classes
│       │   ├── runner/           # Test runner and report generation
│       │   └── stepdefinition/   # Cucumber step definitions
│       └── resources/
│           ├── featureFile/      # Cucumber feature files
│           ├── extent.properties # Extent report config
│           └── log4j2.xml       # Log4j2 configuration
├── properties/
│   └── config.properties         # Application configuration
├── AllTestReport/                # Test reports directory
├── screenshots/                  # Failure screenshots
├── pom.xml                       # Maven configuration
└── README.md                     # This file

```

## Troubleshooting

### Issue: "mvn is not recognized"
**Solution**: Ensure Maven is installed and added to system PATH

### Issue: "Java version not supported"
**Solution**: Ensure Java 11+ is installed: `java -version`

### Issue: Tests not running
**Solution**: 
1. Run `mvn clean install` to download all dependencies
2. Check `.classpath` JRE container is set to JavaSE-11
3. Refresh Eclipse project: Right-click > Maven > Update Project

### Issue: "Cannot find feature file"
**Solution**: Feature files must be in `src/test/resources/featureFile/`

## Technologies Used

- **Java 11+**
- **Selenium 4.18.1**
- **Cucumber 7.15.0**
- **JUnit 4.13.2**
- **TestNG 7.7.1**
- **Log4j 2.23.1**
- **WebDriverManager 5.7.0**
- **Apache POI 5.2.3** (Excel support)

## Notes

- Tests are configured to run with the `@Jewel` tag by default (can be modified in `RunnerClass.java`)
- WebDriverManager automatically handles ChromeDriver setup
- Default credentials are configured in the hooks (modify for your test environment)

## Author
Original framework by: Mugesh0123
Updated: June 2026

