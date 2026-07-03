# ⚡ QUICK START GUIDE

## 🎯 5-Minute Setup

### Prerequisites Check
```powershell
# Check Java version (must be 17+)
java -version

# Check Maven version (must be 3.6.0+)
mvn -v

# Check Git
git --version
```

### Step 1: Navigate to Project
```powershell
cd "c:\Users\HP - PC\git\Cucumber-Framework-BBD-Test-Project-1-"
```

### Step 2: Download Dependencies (First Time Only)
```powershell
mvn clean install
```
⏱️ Expected time: 2-5 minutes (depending on internet speed)

### Step 3: Compile Project
```powershell
mvn clean compile
```
⏱️ Expected time: 30-60 seconds

### Step 4: Run Tests
```powershell
# Option A: Run all tests
mvn clean test

# Option B: Run specific test runner
mvn -Dtest=RunnerClass test

# Option C: Run without tests (compile only)
mvn clean compile -DskipTests
```
⏱️ Expected time: 2-5 minutes (depending on test count)

---

## 📁 Important Directories

```
Project Root: c:\Users\HP - PC\git\Cucumber-Framework-BBD-Test-Project-1-\

📂 Key Directories:
├── src/test/resources/featureFile/    ← Cucumber feature files
├── src/test/java/test/                ← Test source code
├── properties/                         ← Configuration files
├── AllTestReport/                      ← Generated test reports
├── screenshots/                        ← Failed test screenshots
├── logs/                               ← Application logs
└── target/                             ← Build output
```

---

## 📊 Generated Reports Location

After running tests, reports are saved in:

1. **JVM Report** (Most Detailed)
   ```
   AllTestReport/jvm-report/index.html
   ```

2. **Extent Report** (Beautiful HTML)
   ```
   target/cucumber-report/extent.html
   ```

3. **JSON Report** (Machine Readable)
   ```
   AllTestReport/json-report/reports1.json
   ```

4. **JUnit XML Report** (CI/CD Compatible)
   ```
   AllTestReport/junit-report/reports2.xml
   ```

5. **Application Logs**
   ```
   logs/app.log
   ```

---

## 🔧 Configuration Files

### Test URL Configuration
**File**: `properties/config.properties`
```properties
url=http://your-test-url-here.com
```

### Logging Configuration
**File**: `src/test/resources/log4j2.xml`
- Change log level (info/debug/warn)
- Add/remove appenders
- Modify log file location

### Feature File Tag
**File**: `src/test/java/test/runner/RunnerClass.java`
```java
tags = "@Jewel"  // Change to run different feature tags
```

---

## 💻 Common Commands Reference

### Build Operations
```powershell
mvn clean              # Clean build artifacts
mvn compile            # Compile source code
mvn install            # Build and install to local repo
mvn package            # Create JAR/WAR package
```

### Test Operations
```powershell
mvn test                           # Run all tests
mvn test -Dtest=RunnerClass        # Run specific test class
mvn test -Dtest=*Test              # Run tests matching pattern
mvn test -DskipTests               # Skip tests during build
```

### Report Operations
```powershell
mvn site                           # Generate Maven site (optional)
mvn clean test                     # Run tests and generate reports
```

### Help & Information
```powershell
mvn help:active-profiles           # Show active profiles
mvn dependency:tree                # Show dependency tree
mvn -version                       # Show Maven version
```

---

## ✅ Verification Checklist

After setup, verify everything works:

```powershell
# 1. Check Java version
java -version
# Should show: 17.x.x or higher (or a compatible Java; set `maven.compiler.release` to 11 if needed for CI compatibility)

# 2. Check Maven
mvn -v
# Should show: Maven 3.6.0 or higher, Java version 17+

# 3. Run compile check
cd "c:\Users\HP - PC\git\Cucumber-Framework-BBD-Test-Project-1-"
mvn clean compile
# Should end with: BUILD SUCCESS

# 4. Run a quick test
mvn -Dtest=RunnerClass test
# Should execute Cucumber tests and generate reports
```

---

## 🐛 Troubleshooting Quick Fixes

| Problem | Solution |
|---------|----------|
| `mvn: command not found` | Add Maven bin to PATH, restart terminal |
| `Java version X is not supported` | Update Java to 11+, set JAVA_HOME |
| `Cannot read feature files` | Ensure files in `src/test/resources/featureFile/` |
| `WebDriver not found` | Ensure internet for WebDriverManager download |
| `Test timeout` | Increase timeout in BaseClass.java (CONSTANT_WAIT_TIME) |
| `Report not generated` | Check AllTestReport/ directory has write permissions |

---

## 📞 Need Help?

Refer to these files:
1. **README_UPDATED.md** - Full documentation
2. **CONFIGURATION_CHECKLIST.md** - Complete configuration details
3. **PROJECT_RESOLUTION_SUMMARY.md** - All changes made

---

## 🎉 You're All Set!

The project is configured and ready to use. Start with:

```powershell
cd "c:\Users\HP - PC\git\Cucumber-Framework-BBD-Test-Project-1-"
mvn clean test
```

Happy testing! 🚀

