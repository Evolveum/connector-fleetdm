# FleetDM Connector

Low-code, **read-only** [SCIMREST](https://gitlab.evolveum.com/evolveum/scimrest-connector)-based
connector for [FleetDM](https://fleetdm.com): discovery of hosts, reports, agents and MCP servers.

The connector is driven by a manifest (`connector.manifest.yaml`) plus YAML schema and operation
scripts, with a small amount of connector Java (configuration and the connector class) on top of
the `connector-scimrest-common` framework.

## Building

Prerequisites: Java 21, Maven 3.9+, network access to `nexus.evolveum.com`
(the SCIMREST framework artifacts are not on Maven Central).

```sh
mvn clean package
```

This builds the connector bundle: `target/connector-fleetdm-<version>.jar` (bundle with `lib/`
dependencies and `META-INF/conndev-doc/` documentation).

The SCIMREST framework version is a property, defaulting to the current development snapshot:

```sh
# default: -Dscimrest.version=0.2.1-SNAPSHOT
# pin to a release for reproducible builds:
mvn clean package -Dscimrest.version=0.2.0
```

## Connector layout

```
├── pom.xml
└── src/main/
    ├── assembly/
    │   └── connector.xml        # bundle assembly descriptor
    └── resources/
        ├── connector.manifest.yaml   # manifest: application info + schema/operation scripts
        ├── Messages.properties       # display names and help texts for configuration
        └── configurationOverride.properties  # defaults/overrides for the connector configuration
```

## Provenance

Extracted from the [agent-connector-prototype](https://gitlab.evolveum.com/evolveum/agent-connector-prototype)
repository (branch `migrate/fleetdm`); the commit history of this connector is preserved.
