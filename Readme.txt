<mirror>
      <id>nexus</id>
      <mirrorOf>center</mirrorOf>
      <name>internal nexus repository</name>
      <url>http://localhost:8081/nexus/content/groups/public/</url>
  </mirror>

   <profile>
        <id>nexusProfile</id>
        <repositories>
          <repository>
            <id>nexus</id>
            <name>nexus Repository</name>
            <url>http://localhost:8081/nexus/content/groups/public/</url>
  		  <releases>
  			<enabled>true</enabled>
  		  </releases>
  		  <snapshots>
  				<enabled>true</enabled>
  		  </snapshots>

          </repository>
        </repositories>
      </profile>

  <activeProfiles>
      <activeProfile>nexusProfile</activeProfile>
    </activeProfiles