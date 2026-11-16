/*
 * Copyright (c) 2026 Evolveum and contributors
 * Licensed under the EUPL-1.2 or later.
 */
package com.evolveum.polygon.agent.fleetdm;

import com.evolveum.polygon.scimrest.groovy.impl.ManifestBasedConnector;
import org.identityconnectors.framework.spi.ConnectorClass;

@ConnectorClass(
        displayNameKey = "manifest.connector.display",
        configurationClass = FleetdmConfiguration.class,
        messageCatalogPaths = "Messages")
public class FleetdmConnector extends ManifestBasedConnector {
}
