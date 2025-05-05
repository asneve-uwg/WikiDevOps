# DevOpsJavafx
DevOpsJavafx
wiki article sign in and create an account 

##  Using local host deployment
click on the setup.sh file in the WikiDevOps directory

# Deployment process for your Node.js website using Azure WebApp:


### 1. Prepare Node.js App for Deployment

Before deploying to the cloud, ensure the application runs correctly locally:

```bash
# Install dependencies
npm install

# Start the application
node app
```

- Open your browser and verify the application is running locally (usually at `http://localhost:3000` or similar).
- Once verified, stop the application (Ctrl + C in the terminal).

---

### 2. Deploy to Azure WebApp

#### a. Authenticate with Azure

```bash
az login
```

#### b. Deploy the App

```bash
az webapp up --sku F1 --name <your-unique-app-name>
```

> Replace `<your-unique-app-name>` with a globally unique name.

#### c. Verify Deployment

- After deployment, Azure will provide a URL to access your app.
- Open the URL in your browser and verify the app is running.
- Take a screenshot of the **About** page with the URL visible and name it `initial-web-app`.

#### d. Check Azure Resources

- Log in to the Azure Portal
- Navigate to the **Resource Group** and **Web App** created during deployment.

---

#### d. Confirm in Azure Portal

- Revisit the Azure Dashboard to ensure the updated app and resources are correctly reflected.
