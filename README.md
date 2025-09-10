#  Jenkins – Java – Maven CI/CD Pipeline Project  

This project demonstrates how to build a **Jenkins CI/CD pipeline** for a Java Maven application, using **Jenkins Shared Libraries**, GitLab webhooks, and Docker image builds.  
The pipeline automates building, testing, versioning, and containerizing Java apps, then pushes the resulting image to a private registry.  

---

### 🛠 Tech Stack  
![Jenkins](https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white)  
![Groovy](https://img.shields.io/badge/Groovy-4298B8?style=for-the-badge&logo=apachegroovy&logoColor=white)  
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)  
![GitLab](https://img.shields.io/badge/GitLab-FC6D26?style=for-the-badge&logo=gitlab&logoColor=white)  
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)  
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=openjdk&logoColor=white)  
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)  

---

##  Project Overview  

The project contains **three main demo implementations**:  

1. **Jenkins Shared Library (JSL)**  
   - Extracts common Groovy build logic into reusable functions.  
   - Stored in a separate Git repository.  
   - Integrated globally in Jenkins and used inside `Jenkinsfile`.  

2. **GitLab Webhook Triggered Pipeline**  
   - GitLab plugin installed in Jenkins.  
   - Configured GitLab webhook + access token.  
   - Pipeline triggers automatically on each Git push.  

3. **Dynamic Versioning & Docker Build**  
   - Increment patch version dynamically.  
   - Clean up old Maven artifacts.  
   - Build Docker image with **dynamic tags**.  
   - Push Docker image to a private registry.  
   - Commit new version back to Git repository (while preventing infinite loop triggers).  

---

##  Problem &  Solution  

### Problem (Before)  
- Build logic was duplicated across pipelines.  
- Manual triggering of pipelines slowed down feedback loops.  
- Application versioning was inconsistent.  
- Docker images were built manually, which was error-prone.  

### Solution (Now)  
- **Jenkins Shared Libraries**: centralize build logic for consistency and reusability.  
- **GitLab Webhooks**: trigger Jenkins pipelines automatically on push.  
- **Versioning Automation**: dynamically increment patch versions in pipeline.  
- **Docker Automation**: build, tag, and push images automatically with version tags.  
- **Jenkins CI/CD**: orchestrates the full workflow in one pipeline.  

---

## ⚙️ Setup Instructions  

1. **Clone Repository**  
   
-    git clone <repo-url>
-    cd jenkins-java-maven-ci-cd

-    Configure Jenkins

- Install GitLab Plugin

---

2. Configure GitLab Access Token in Jenkins Credentials

- Add DockerHub credentials for pushing images

---

3. Connect GitLab Webhook

- In GitLab → Settings → Webhooks

- Add your Jenkins webhook URL

- Use a secret token for security

---

4. Run the Pipeline

- On each Git push → webhook triggers Jenkins build automatically

- Pipeline stages:

- Increment version

- Build Java app with Maven

- Build & push Docker image

- Commit updated version to repo


---


 # Project Structure
 
jenkins-java-maven-ci-cd/

├── Jenkinsfile               # Pipeline definition

├── vars/                     # Shared Library functions (Groovy scripts)

│   ├── buildApp.groovy

│   ├── dockerBuild.groovy

│   └── versioning.groovy

├── src/                      # Java application source

├── pom.xml                   # Maven configuration

└── README.md


---
<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/0ad8aa47-57dd-4e7c-87f5-5cb1edda69ab" />



---


#  My Learnings

- How to extract build logic into Jenkins Shared Libraries for reuse.

- How to configure GitLab webhooks to automatically trigger Jenkins pipelines.

- How to handle dynamic versioning inside a CI pipeline.

- Best practices to avoid infinite commit loops when committing back from Jenkins.

- How to integrate Maven, Docker, Git, and Jenkins in one cohesive CI/CD pipeline.

---

# Summary

- Jenkins → Orchestrates the entire CI/CD pipeline.

- Groovy Shared Library → Centralizes reusable build logic.

- GitLab Webhooks → Automatically trigger builds.

- Maven → Builds Java application and handles dependencies.

- Docker → Packages application into container images with version tags.

- Git → Source control and version updates.

---

# Build Evidence
**This is one of my builds**

<img width="938" height="561" alt="Screenshot from 2025-09-10 21-32-32" src="https://github.com/user-attachments/assets/d4791ee5-4af3-49bd-a399-4b2a51212f5c" />

---


