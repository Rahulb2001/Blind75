# 📧 AI-Powered Mail Reply Chrome Extension  

An AI-based Chrome Extension that helps you generate professional, context-aware, and instant **email replies**.  
Built with **Spring Boot (backend)** + **AI integration** + **Chrome Extension (frontend)**.  

---

## 🚀 Features
- ✨ Auto-generate **email replies** based on incoming mail content.  
- 🤖 AI-powered natural language responses (formal, casual, or professional).  
- ⚡ Real-time integration between Chrome Extension and Spring Boot backend.  
- 📩 Supports Gmail integration for seamless productivity.  
- 🔧 Easy to install and run locally.  

---

## 🛠️ Tech Stack
- **Frontend:** JavaScript, Chrome Extension APIs, React.js  
- **Backend:** Spring Boot (Java), REST APIs  
- **AI:** Prompt-based AI response generation  
- **Tools:** Git, Postman  

---

## 📂 Project Structure
AI-Powered-Mail-Reply-Chrome-Extension/
│── backend/ # Spring Boot backend with AI service
│── extension/ # Chrome extension code (popup, content scripts)
│── manifest.json # Chrome extension config
│── README.md # Project documentation


---

## ⚡ Getting Started  

### 1. Clone the repo
```bash
git clone https://github.com/Rahulb2001/AI-Powered-Mail-Reply-Chrome-Extension.git
cd AI-Powered-Mail-Reply-Chrome-Extension

2. Run the Backend (Spring Boot)
cd backend
mvn spring-boot:run

3. Load the Chrome Extension

Open Chrome and go to chrome://extensions/.

Enable Developer mode (top right).

Click Load unpacked.

Select the extension/ folder.

4. Use the Extension
Open Gmail in Chrome.

Select an email.

Click the extension icon → AI will generate a suggested reply.
