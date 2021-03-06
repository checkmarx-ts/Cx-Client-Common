package com.cx.restclient.configuration;

import com.cx.restclient.dto.CxVersion;
import com.cx.restclient.dto.RemoteSourceTypes;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.Serializable;

import org.whitesource.fs.FSAConfigProperties;

/**
 * Created by galn on 21/12/2016.
 */
public class CxScanConfig implements Serializable {

    private Boolean sastEnabled = false;
    private Boolean osaEnabled = false;

    private String cxOrigin;
    private CxVersion cxVersion;

    private boolean disableCertificateValidation = false;
    private boolean useSSOLogin = false;

    private String sourceDir;
    private File reportsDir;
    private String username;
    private String password;
    private String url;
    private String projectName;
    private String teamPath;
    private String teamId;
    private Boolean denyProject = false;
    private Boolean hideResults = false;
    private Boolean isPublic = true;
    private Boolean forceScan = false;
    private String presetName;
    private Integer presetId;
    private String sastFolderExclusions;
    private String sastFilterPattern;
    private Integer sastScanTimeoutInMinutes;
    private Integer sastOsaScanTimeoutInMinutes;
    private String scanComment;
    private Boolean isIncremental = false;
    private Boolean isSynchronous = false;
    private Boolean sastThresholdsEnabled = false;
    private Integer sastHighThreshold;
    private Integer sastMediumThreshold;
    private Integer sastLowThreshold;
    private Boolean sastNewResultsThresholdEnabled = false;
    private String sastNewResultsThresholdSeverity;

    private Boolean generatePDFReport = false;
    private File zipFile;
    private Integer engineConfigurationId = 1;

    private String osaFolderExclusions;
    private String osaFilterPattern;
    private String osaArchiveIncludePatterns;
    private Boolean osaGenerateJsonReport = true;
    private Boolean osaRunInstall = false;
    private Boolean osaThresholdsEnabled = false;
    private Integer osaHighThreshold;
    private Integer osaMediumThreshold;
    private Integer osaLowThreshold;
    private FSAConfigProperties osaFsaConfig; //for MAVEN
    private String osaDependenciesJson;
    private Boolean avoidDuplicateProjectScans = false;
    private boolean enablePolicyViolations = false;
    private Boolean generateXmlReport = true;

    private String cxARMUrl;
    private String[] paths;
    //remote source control
    private RemoteSourceTypes remoteType = null;
    private String remoteSrcUser;
    private String remoteSrcPass;
    private String remoteSrcUrl;
    private int remoteSrcPort;
    private byte[] remoteSrcKeyFile;
    private String remoteSrcBranch;
    private String preforceMode;

    //for Jenkins PDF rport
    private int jenkinsJob;

    public CxScanConfig() {
    }

    public CxScanConfig(String url, String username, String password, String cxOrigin, boolean disableCertificateValidation) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.cxOrigin = cxOrigin;
        this.disableCertificateValidation = disableCertificateValidation;
    }

    public Boolean getSastEnabled() {
        return sastEnabled;
    }

    public void setSastEnabled(Boolean sastEnabled) {
        this.sastEnabled = sastEnabled;
    }

    public Boolean getOsaEnabled() {
        return osaEnabled;
    }

    public void setOsaEnabled(Boolean osaEnabled) {
        this.osaEnabled = osaEnabled;
    }

    public String getCxOrigin() {
        return cxOrigin;
    }

    public void setCxOrigin(String cxOrigin) {
        this.cxOrigin = cxOrigin;
    }

    public boolean isDisableCertificateValidation() {
        return disableCertificateValidation;
    }

    public void setDisableCertificateValidation(boolean disableCertificateValidation) {
        this.disableCertificateValidation = disableCertificateValidation;
    }

    public boolean isUseSSOLogin() {
        return useSSOLogin;
    }

    public void setUseSSOLogin(boolean useSSOLogin) {
        this.useSSOLogin = useSSOLogin;
    }

    public Boolean getAvoidDuplicateProjectScans() {
        return avoidDuplicateProjectScans;
    }

    public String getSourceDir() {
        return sourceDir;
    }

    public void setSourceDir(String sourceDir) {
        this.sourceDir = sourceDir;
    }

    public File getReportsDir() {
        return reportsDir;
    }

    public void setReportsDir(File reportsDir) {
        this.reportsDir = reportsDir;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTeamPath() {
        return teamPath;
    }

    public void setTeamPath(String teamPath) {
        if (!StringUtils.isEmpty(teamPath) && !teamPath.startsWith("\\") && !teamPath.startsWith(("/"))) {
            teamPath = "\\" + teamPath;
        }
        this.teamPath = teamPath;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Boolean getDenyProject() {
        return denyProject;
    }

    public void setDenyProject(Boolean denyProject) {
        this.denyProject = denyProject;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    public Boolean getForceScan() {
        return forceScan;
    }

    public void setForceScan(Boolean forceScan) {
        this.forceScan = forceScan;
    }

    public String getPresetName() {
        return presetName;
    }

    public void setPresetName(String presetName) {
        this.presetName = presetName;
    }

    public Integer getPresetId() {
        return presetId;
    }

    public void setPresetId(Integer presetId) {
        this.presetId = presetId;
    }

    public String getSastFolderExclusions() {
        return sastFolderExclusions;
    }

    public void setSastFolderExclusions(String sastFolderExclusions) {
        this.sastFolderExclusions = sastFolderExclusions;
    }

    public String getSastFilterPattern() {
        return sastFilterPattern;
    }

    public void setSastFilterPattern(String sastFilterPattern) {
        this.sastFilterPattern = sastFilterPattern;
    }

    public Integer getSastScanTimeoutInMinutes() {
        return sastScanTimeoutInMinutes == null ? -1 : sastScanTimeoutInMinutes;
    }

    public void setSastScanTimeoutInMinutes(Integer sastScanTimeoutInMinutes) {
        this.sastScanTimeoutInMinutes = sastScanTimeoutInMinutes;
    }

    public Integer getOsaScanTimeoutInMinutes() {
        return sastOsaScanTimeoutInMinutes == null ? -1 : sastOsaScanTimeoutInMinutes;
    }

    public void setOsaScanTimeoutInMinutes(Integer sastOsaScanTimeoutInMinutes) {
        this.sastOsaScanTimeoutInMinutes = sastOsaScanTimeoutInMinutes;
    }

    public String getScanComment() {
        return scanComment;
    }

    public void setScanComment(String scanComment) {
        this.scanComment = scanComment;
    }

    public Boolean getIncremental() {
        return isIncremental;
    }

    public void setIncremental(Boolean incremental) {
        this.isIncremental = incremental;
    }

    public Boolean getSynchronous() {
        return isSynchronous;
    }

    public void setSynchronous(Boolean synchronous) {
        this.isSynchronous = synchronous;
    }

    public Boolean getSastThresholdsEnabled() {
        return sastThresholdsEnabled;
    }

    public void setSastThresholdsEnabled(Boolean sastThresholdsEnabled) {
        this.sastThresholdsEnabled = sastThresholdsEnabled;
    }

    public Integer getSastHighThreshold() {
        return sastHighThreshold;
    }

    public void setSastHighThreshold(Integer sastHighThreshold) {
        this.sastHighThreshold = sastHighThreshold;
    }

    public Integer getSastMediumThreshold() {
        return sastMediumThreshold;
    }

    public void setSastMediumThreshold(Integer sastMediumThreshold) {
        this.sastMediumThreshold = sastMediumThreshold;
    }

    public Integer getSastLowThreshold() {
        return sastLowThreshold;
    }

    public void setSastLowThreshold(Integer sastLowThreshold) {
        this.sastLowThreshold = sastLowThreshold;
    }

    public String getSastNewResultsThresholdSeverity() {
        return sastNewResultsThresholdSeverity;
    }

    public void setSastNewResultsThresholdSeverity(String sastNewResultsThresholdSeverity) {
        this.sastNewResultsThresholdSeverity = sastNewResultsThresholdSeverity;
    }

    public Boolean getSastNewResultsThresholdEnabled() {
        return sastNewResultsThresholdEnabled;
    }

    public void setSastNewResultsThresholdEnabled(Boolean sastNewResultsThresholdEnabled) {
        this.sastNewResultsThresholdEnabled = sastNewResultsThresholdEnabled;
    }

    public Boolean getGeneratePDFReport() {
        return generatePDFReport;
    }

    public void setGeneratePDFReport(Boolean generatePDFReport) {
        this.generatePDFReport = generatePDFReport;
    }

    public File getZipFile() {
        return zipFile;
    }

    public void setZipFile(File zipFile) {
        this.zipFile = zipFile;
    }

    public Integer getEngineConfigurationId() {
        return engineConfigurationId;
    }

    public void setEngineConfigurationId(Integer engineConfigurationId) {
        this.engineConfigurationId = engineConfigurationId;
    }

    public String getOsaFilterPattern() {
        return osaFilterPattern;
    }

    public String getOsaFolderExclusions() {
        return osaFolderExclusions;
    }

    public void setOsaFolderExclusions(String osaFolderExclusions) {
        this.osaFolderExclusions = osaFolderExclusions;
    }

    public void setOsaFilterPattern(String osaFilterPattern) {
        this.osaFilterPattern = osaFilterPattern;
    }

    public String getOsaArchiveIncludePatterns() {
        return osaArchiveIncludePatterns;
    }

    public void setOsaArchiveIncludePatterns(String osaArchiveIncludePatterns) {
        this.osaArchiveIncludePatterns = osaArchiveIncludePatterns;
    }

    public Boolean getOsaRunInstall() {
        return osaRunInstall;
    }

    public void setOsaRunInstall(Boolean osaRunInstall) {
        this.osaRunInstall = osaRunInstall;
    }

    public Boolean getOsaThresholdsEnabled() {
        return osaThresholdsEnabled;
    }

    public void setOsaThresholdsEnabled(Boolean osaThresholdsEnabled) {
        this.osaThresholdsEnabled = osaThresholdsEnabled;
    }

    public Integer getOsaHighThreshold() {
        return osaHighThreshold;
    }

    public void setOsaHighThreshold(Integer osaHighThreshold) {
        this.osaHighThreshold = osaHighThreshold;
    }

    public Integer getOsaMediumThreshold() {
        return osaMediumThreshold;
    }

    public void setOsaMediumThreshold(Integer osaMediumThreshold) {
        this.osaMediumThreshold = osaMediumThreshold;
    }

    public Integer getOsaLowThreshold() {
        return osaLowThreshold;
    }

    public void setOsaLowThreshold(Integer osaLowThreshold) {
        this.osaLowThreshold = osaLowThreshold;
    }

    public FSAConfigProperties getOsaFsaConfig() {
        return osaFsaConfig;
    }

    public void setOsaFsaConfig(FSAConfigProperties osaFsaConfig) {
        this.osaFsaConfig = osaFsaConfig;
    }

    public String getOsaDependenciesJson() {
        return osaDependenciesJson;
    }

    public boolean isSASTThresholdEffectivelyEnabled() {
        return getSastEnabled() && getSastThresholdsEnabled() && (getSastHighThreshold() != null || getSastMediumThreshold() != null || getSastLowThreshold() != null);
    }

    public boolean isOSAThresholdEffectivelyEnabled() {
        return getOsaEnabled() && getOsaThresholdsEnabled() && (getOsaHighThreshold() != null || getOsaMediumThreshold() != null || getOsaLowThreshold() != null);
    }

    public void setOsaDependenciesJson(String osaDependenciesJson) {
        this.osaDependenciesJson = osaDependenciesJson;
    }

    public Boolean getOsaGenerateJsonReport() {
        return osaGenerateJsonReport;
    }

    public void setOsaGenerateJsonReport(Boolean osaGenerateJsonReport) {
        this.osaGenerateJsonReport = osaGenerateJsonReport;
    }

    public boolean getEnablePolicyViolations() {
        return enablePolicyViolations;
    }

    public void setEnablePolicyViolations(boolean enablePolicyViolations) {
        this.enablePolicyViolations = enablePolicyViolations;
    }

    public boolean isEnablePolicyViolations() {
        return enablePolicyViolations;
    }

    public String getCxARMUrl() {
        return cxARMUrl;
    }

    public void setCxARMUrl(String cxARMUrl) {
        this.cxARMUrl = cxARMUrl;
    }

    public Boolean getHideResults() {
        return hideResults;
    }

    public void setHideResults(Boolean hideResults) {
        this.hideResults = hideResults;
    }


    public Boolean isAvoidDuplicateProjectScans() {
        return avoidDuplicateProjectScans;
    }

    public void setAvoidDuplicateProjectScans(Boolean avoidDuplicateProjectScans) {
        this.avoidDuplicateProjectScans = avoidDuplicateProjectScans;
    }

    public String getRemoteSrcUser() {
        return remoteSrcUser;
    }

    public void setRemoteSrcUser(String remoteSrcUser) {
        this.remoteSrcUser = remoteSrcUser;
    }

    public String getRemoteSrcPass() {
        return remoteSrcPass;
    }

    public void setRemoteSrcPass(String remoteSrcPass) {
        this.remoteSrcPass = remoteSrcPass;
    }

    public String getRemoteSrcUrl() {
        return remoteSrcUrl;
    }

    public void setRemoteSrcUrl(String remoteSrcUrl) {
        this.remoteSrcUrl = remoteSrcUrl;
    }

    public int getRemoteSrcPort() {
        return remoteSrcPort;
    }

    public void setRemoteSrcPort(int remoteSrcPort) {
        this.remoteSrcPort = remoteSrcPort;
    }

    public byte[] getRemoteSrcKeyFile() {
        return remoteSrcKeyFile;
    }

    public void setRemoteSrcKeyFile(byte[] remoteSrcKeyFile) {
        this.remoteSrcKeyFile = remoteSrcKeyFile;
    }

    public RemoteSourceTypes getRemoteType() {
        return remoteType;
    }

    public void setRemoteType(RemoteSourceTypes remoteType) {
        this.remoteType = remoteType;
    }

    public String[] getPaths() {
        return paths;
    }

    public void setPaths(String[] paths) {
        this.paths = paths;
    }

    public String getRemoteSrcBranch() {
        return remoteSrcBranch;
    }

    public void setRemoteSrcBranch(String remoteSrcBranch) {
        this.remoteSrcBranch = remoteSrcBranch;
    }

    public String getPreforceMode() {
        return preforceMode;
    }

    public void setPreforceMode(String preforceMode) {
        this.preforceMode = preforceMode;
    }

    public int getJenkinsJob() {
        return jenkinsJob;
    }

    public void setJenkinsJob(int jenkinsJob) {
        this.jenkinsJob = jenkinsJob;
    }

    public Boolean getGenerateXmlReport() {
        return generateXmlReport;
    }

    public void setGenerateXmlReport(Boolean generateXmlReport) {
        this.generateXmlReport = generateXmlReport;
    }

    public CxVersion getCxVersion() {
        return cxVersion;
    }

    public void setCxVersion(CxVersion cxVersion) {
        this.cxVersion = cxVersion;
    }
}
