package pl.wercia.example.maven.manifest;

public class MavenManifest {

	public static void main(String[] args) {
		MavenManifest mavenManifest = new MavenManifest();
		System.out.println("Name: " + mavenManifest.getName());
		System.out.println("Version: " + mavenManifest.getVersion());
		System.out.println("Organization name: " + mavenManifest.getOrganizationName());
	}

	public String getName() {
		return this.getClass().getPackage().getImplementationTitle();
	}

	public String getVersion() {
		return this.getClass().getPackage().getImplementationVersion();
	}

	public String getOrganizationName() {
		return this.getClass().getPackage().getImplementationVendor();
	}

}
