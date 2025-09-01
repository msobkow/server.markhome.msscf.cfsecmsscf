
// Description: Java 11 MssCF Reference for SecApp Relationship Cluster.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.sql.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;

/**
 *	CFSecMssCFReferenceSecAppCluster binds SecApp.Cluster
 *	as an instance of MssCFGenReferenceObj.
 */
public class CFSecMssCFReferenceSecAppCluster
	extends MssCFGenReferenceObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFReferenceSecAppCluster() {
		super();
	}

	public CFSecMssCFReferenceSecAppCluster( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecApp",
			"Cluster",
			"Cluster" );
	}

	public ICFLibAnyObj dereference( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFReferenceSecAppCluster.dereference() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext.getGenDef()" );
		}

		ICFSecClusterObj obj;

		if( genDef instanceof ICFSecSecAppObj ) {
			obj = (ICFSecClusterObj)((ICFSecSecAppObj)genDef).getRequiredContainerCluster();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecAppObj" );
		}

		return( obj );
	}
}
